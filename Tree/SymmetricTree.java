/*LeetCode - Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center). */
import java.io.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class SymmetricTree {
    Node root;

    SymmetricTree() {
        root = null;
    }
    SymmetricTree(int key) {
        root = new Node(key);
    }
    public boolean mirrorImage(Node root1, Node root2) {
        if(root1== null && root2== null) {
            return true;
        }
        
        if(root1!= null  && root2!=null  && root1.data == root2.data) {
            return mirrorImage(root1.left , root2.right) &&
                mirrorImage(root1.right , root2.left);
        }
        return false;
    }
    public static void main (String args[]) {
        SymmetricTree tree = new SymmetricTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(3);
        boolean result = tree.mirrorImage(tree.root, tree.root);
        System.out.println(result);
    }
}