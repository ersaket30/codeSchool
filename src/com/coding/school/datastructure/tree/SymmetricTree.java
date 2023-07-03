package com.coding.school.datastructure.tree;

class STree
{
    int data;
    STree left = null, right = null;

    STree(int data) {
        this.data = data;
    }
}

class Main11
{
    // Function to check if subtree rooted at `X` and `Y` mirror each other
    public static boolean isSymmetric(STree X, STree Y)
    {
        // base case: if both trees are empty
        if (X == null && Y == null) {
            return true;
        }

        // return true if
        // 1. Both trees are non-empty, and
        // 2. The left subtree is the mirror of the right subtree, and
        // 3. The right subtree is the mirror of the left subtree
        return (X != null && Y != null) &&
                isSymmetric(X.left, Y.right) &&
                isSymmetric(X.right, Y.left);
    }

    // Function to check if a given binary tree has a symmetric structure or not
    public static boolean isSymmetric(STree root)
    {
        // base case
        if (root == null) {
            return true;
        }

        // return true if left and right subtree mirror each other
        return isSymmetric(root.left, root.right);
    }

    public static void main(String[] args)
    {
        /* Construct the following tree
              1
            /   \
           /     \
          2       3
           \     /
            5   6
        */

        STree root = new STree(1);
        root.left = new STree(2);
        root.right = new STree(3);
        root.left.right = new STree(4);
        root.right.left = new STree(5);

        if (isSymmetric(root)) {
            System.out.print("The binary tree is symmetric");
        }
        else {
            System.out.print("The binary tree is not symmetric");
        }
    }
}
