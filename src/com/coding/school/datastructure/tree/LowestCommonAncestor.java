package com.coding.school.datastructure.tree;

//Java implementation to find lowest common ancestor of
// n1 and n2 using one traversal of binary tree

/* Class containing left and right child of current
 node and key value*/
class Node4
{
    int data;
    Node4 left, right;

    public Node4(int item)
    {
        data = item;
        left = right = null;
    }
}

public class LowestCommonAncestor
{
    //Root of the Binary Tree
    Node4 root;

    Node4 findLCA(int n1, int n2)
    {
        return findLCA(root, n1, n2);
    }

    // This function returns pointer to LCA of two given
    // values n1 and n2. This function assumes that n1 and
    // n2 are present in Binary Tree
    Node4 findLCA(Node4 node4, int n1, int n2)
    {
        // Base case
        if (node4 == null)
            return null;

        // If either n1 or n2 matches with root's key, report
        // the presence by returning root (Note that if a key is
        // ancestor of other, then the ancestor key becomes LCA
        if (node4.data == n1 || node4.data == n2)
            return node4;

        // Look for keys in left and right subtrees
        Node4 left_lca = findLCA(node4.left, n1, n2);
        Node4 right_lca = findLCA(node4.right, n1, n2);

        // If both of the above calls return Non-NULL, then one key
        // is present in once subtree and other is present in other,
        // So this node is the LCA
        if (left_lca!=null && right_lca!=null)
            return node4;

        // Otherwise check if left subtree or right subtree is LCA
        return (left_lca != null) ? left_lca : right_lca;
    }

    /* Driver program to test above functions */
    public static void main(String args[])
    {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node4(1);
        tree.root.left = new Node4(2);
        tree.root.right = new Node4(3);
        tree.root.left.left = new Node4(4);
        tree.root.left.right = new Node4(5);
        tree.root.right.left = new Node4(6);
        tree.root.right.right = new Node4(7);
        System.out.println("LCA(4, 5) = " +
                tree.findLCA(4, 5).data);
        System.out.println("LCA(4, 6) = " +
                tree.findLCA(4, 6).data);
        System.out.println("LCA(3, 4) = " +
                tree.findLCA(3, 4).data);
        System.out.println("LCA(2, 4) = " +
                tree.findLCA(2, 4).data);
    }
}
