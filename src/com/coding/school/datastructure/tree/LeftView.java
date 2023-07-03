package com.coding.school.datastructure.tree;

import java.util.HashMap;
import java.util.Map;

// A class to store a binary tree node
class Node5
{
    int key;
    Node5 left = null, right = null;

    Node5(int key) {
        this.key = key;
    }
}

class Main1
{
    // Recursive function to traverse the nodes in a preorder fashion
    public static void leftView(Node5 root, int level, Map<Integer, Integer> map)
    {
        // base case
        if (root == null) {
            return;
        }

        // if the level is visited for the first time, insert the current node
        // and level information into the map
        map.putIfAbsent(level, root.key);

        leftView(root.left, level + 1, map);
        leftView(root.right, level + 1, map);
    }

    // Function to print the left view of a given binary tree
    public static void leftView(Node5 root)
    {
        // create an empty HashMap to store the first node for each level
        Map<Integer, Integer> map = new HashMap<>();

        // traverse the tree and fill the map
        leftView(root, 1, map);

        // iterate through the HashMap in sorted order of its keys
        // and print the left view
        for (int i = 1; i <= map.size(); i++) {
            System.out.print(map.get(i) + " ");
        }
    }

    public static void main(String[] args)
    {
        Node5 root = new Node5(1);
        root.left = new Node5(2);
        root.right = new Node5(3);
        root.left.right = new Node5(4);
        root.right.left = new Node5(5);
        root.right.right = new Node5(6);
        root.right.left.left = new Node5(7);
        root.right.left.right = new Node5(8);

        leftView(root);
    }
}
