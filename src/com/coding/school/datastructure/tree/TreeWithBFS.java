package com.coding.school.datastructure.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;

public class TreeWithBFS<T> {
    private T value;
    private List<TreeWithBFS<T>> children;

    public TreeWithBFS(T value) {
        this.value = value;
        children = new ArrayList<>();
    }

    public static <T> TreeWithBFS<T> of(T value){
        return new TreeWithBFS<>(value);
    }
    public TreeWithBFS<T> addChild(T value){
        TreeWithBFS<T> tree = new TreeWithBFS<>(value);
        children.add(tree);
        return tree;
    }
    public static <T> Optional<TreeWithBFS<T>> search(T value, TreeWithBFS<T> root){
        Queue<TreeWithBFS<T>> myQueue = new ArrayDeque<>();
        myQueue.add(root);
        while (!myQueue.isEmpty()){
            TreeWithBFS<T> currentNode = myQueue.remove();
            System.out.println("Searching Node with value... "+currentNode.value);
            if(currentNode.value.equals(value)){
                return Optional.of(currentNode);
            }else {
                myQueue.addAll(currentNode.children);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        TreeWithBFS<Integer> root = TreeWithBFS.of(15);
        TreeWithBFS<Integer> rootFirstChild = root.addChild(12);
        TreeWithBFS<Integer> depthMostChild = rootFirstChild.addChild(14);
        TreeWithBFS<Integer> rootSecondChild = root.addChild(4);
        Optional<TreeWithBFS<Integer>> result = TreeWithBFS.search(5,root);
        System.out.println("Is Value found: "+result.isPresent());
    }
}
