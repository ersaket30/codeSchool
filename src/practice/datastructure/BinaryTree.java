package practice.datastructure;

public class BinaryTree {
    Node root;
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(12);
        tree.add(10);
        tree.add(1);
        tree.add(20);
        tree.show();
        System.out.println("tree height is "+tree.calculateTreeHeight(tree.root));
        System.out.println("total Nodes of tree are "+tree.countTotalNodes(tree.root));
        System.out.println(tree.contains(18));
    }

    private static int countTotalNodes(Node node){
        int count = 1;
        if(node==null){
            return 0;
        }
        count += countTotalNodes(node.left);
        count += countTotalNodes(node.right);
        return count;
    }

    private int calculateTreeHeight(Node node) {
        if(node==null){
            return 0;
        }
        int leftHeight = calculateTreeHeight(node.left);
        int rightHeight = calculateTreeHeight(node.right);
        return Math.max(leftHeight,rightHeight)+1;
    }


    private boolean contains(int i) {
        return this.containsRecursive(root,i);
    }

    private boolean containsRecursive(Node root, int i) {
        if(root == null){
            return false;
        }
        if(root.data == i){
            return true;
        }
        return i < root.data ? containsRecursive(root.left,i) : containsRecursive(root.right,i);
    }

    private void show() {
        this.displayRecursive(root);
    }

    private void displayRecursive(Node current) {
        if(current != null){
            displayRecursive(current.left);
            System.out.println(current.data);
            displayRecursive(current.right);
        }
    }

    private void add(int i) {
        root = this.insertElement(root,i);
    }

    private Node insertElement(Node root, int i) {
        if(root == null){
            root = new Node(i);
            return root;
        }
        if(i< root.data){
            root.left = insertElement(root.left,i);
        }else if(i> root.data){
            root.right = insertElement(root.right,i);
        }else {
            return root;
        }
        return root;
    }
}
