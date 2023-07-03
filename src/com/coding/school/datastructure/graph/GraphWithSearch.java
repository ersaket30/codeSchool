package com.coding.school.datastructure.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class GraphWithSearch<T> {
    private T value;
    private Set<GraphWithSearch<T>> neighbours;

    public GraphWithSearch(T value){
        this.value = value;
        neighbours = new HashSet<>();
    }

    public void connect(GraphWithSearch<T> node){
        if(this == node) throw new IllegalArgumentException("Can't connect node to itself");
        this.neighbours.add(node);
        node.neighbours.add(this);
    }

    public static <T> Optional<GraphWithSearch<T>> bfsSearch(T value, GraphWithSearch<T> start){
        Queue<GraphWithSearch<T>> queue = new ArrayDeque<>();
        queue.add(start);
        List<GraphWithSearch<T>> visited = new ArrayList<>();
        while (!queue.isEmpty()){
            GraphWithSearch<T> current = queue.remove();
            System.out.println("Visting Node..."+current.value);
            if(current.value.equals(value)){
                return Optional.of(current);
            }else {
                visited.add(current);
                queue.addAll(current.neighbours);
                queue.removeAll(visited);
            }
        }
        return Optional.empty();
    }

    public static <T> Optional<GraphWithSearch<T>> dfsSearch(T value, GraphWithSearch<T> start){
        Stack<GraphWithSearch<T>> stack = new Stack<>();
        stack.push(start);
        List<GraphWithSearch<T>> isVisited = new ArrayList<>();
        while (!stack.isEmpty()) {
            GraphWithSearch<T> current = stack.pop();
            System.out.println("Visiting Node..." + current.value);
            if (!isVisited.contains(current)) {
                if (current.value == value) {
                    return Optional.of(current);
                } else {
                    isVisited.add(current);
                    for (GraphWithSearch<T> child : current.neighbours) {
                        if (!isVisited.contains(child)) {
                            stack.push(child);
                        }
                    }
                }
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        GraphWithSearch<Integer> start = new GraphWithSearch<>(12);
        GraphWithSearch<Integer> firstNeighbor = new GraphWithSearch<>(13);
        start.connect(firstNeighbor);

        GraphWithSearch<Integer> firstNeighborNeighbor = new GraphWithSearch<>(3);
        firstNeighbor.connect(firstNeighborNeighbor);
        firstNeighborNeighbor.connect(start);

        GraphWithSearch<Integer> secondNeighbor = new GraphWithSearch<>(14);
        start.connect(secondNeighbor);

        System.out.println("is value present: "+ GraphWithSearch.bfsSearch(4, start).isPresent());
        System.out.println("is value present: "+ GraphWithSearch.dfsSearch(14, start).isPresent());

    }
}
