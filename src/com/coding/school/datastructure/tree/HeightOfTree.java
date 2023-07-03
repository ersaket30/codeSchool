package com.coding.school.datastructure.tree;

class Node8{
    int data;
    Node8 left = null, right =null;
    Node8(int data){
            this.data=data;
        }
    }

class HeightOfTree{

    public static void main(String[] args) {
        Node8 root = new Node8(12);
        root.left = new Node8(10);
        root.right = new Node8(20);
        root.left.left = new Node8(8);
        root.left.right = new Node8(12);
        root.right.left = new Node8(16);
        root.right.right = new Node8(25);

        System.out.println("Height of binary tree is "+heightOfTree(root));
    }

        private static int heightOfTree(Node8 current) {

         if (current==null){
             return 0;
         }
         return 1+Math.max(heightOfTree(current.left),heightOfTree(current.right));
        }
    }
