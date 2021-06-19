//package notes.Tree;

import java.io.*;

class  Node {
    int data;
    Node left;
    Node right;

    public Node(int item) {
        this.data = item;
        this.left = null;
        this.right = null;
    }
}

public class Tree {
    Node root;
    Tree() {
        root = null;
    }
    Tree(int key) {
        root = new Node(key);
    }
    int findSum(Node root) {
        if(root == null)
            return 0;
        return root.data + findSum(root.left)+ findSum(root.right);
    }
    public static void main( String args[]) {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        int sum = tree.findSum(tree.root);
        System.out.println(sum);
    }
}