package Btree.arnab;

import java.util.List;
import  java.util.ArrayList;

public class MORIS_INODER {
    static class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static List<Integer> inorderTraversal(Node root) {
        List<Integer> inorder = new ArrayList<Integer>();

        Node cur = root;
        while(cur != null) {
            if(cur.left == null) {
                inorder.add(cur.val);
                cur = cur.right;
            }
            else {
                Node prev = cur.left;
                while(prev.right != null && prev.right != cur) {
                    prev = prev.right;
                }

                if(prev.right == null) {
                    prev.right = cur;
                    cur = cur.left;
                }
                else {
                    prev.right = null;
                    inorder.add(cur.val);
                    cur = cur.right;
                }
            }
        }
        return inorder;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);

        ArrayList < Integer > inoder = new ArrayList < > ();
        inoder = (ArrayList<Integer>) inorderTraversal(root);

        System.out.println("The Preorder Traversal is: ");
        for (int i = 0; i < inoder.size(); i++) {
            System.out.print(inoder.get(i) + " ");
        }
    }
}
