package Arnab.bST;

import java.util.ArrayList;

public class Convert_bst {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static void getInorder(Node root , ArrayList<Integer> inorder){
        if (root==null){
            return;
        }
        getInorder(root.left,inorder);
        inorder.add(root.val);
        getInorder(root.right,inorder);
    }
    public static Node createBST(ArrayList<Integer> inorder , int start , int end){
        if (start>end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder,start,mid-1);
        root.right = createBST(inorder,mid+1,end);
        return root;
    }

    public static Node Convert_BSt(Node root){
//        inorder sequence
        ArrayList <Integer> inoder = new ArrayList<>();
        getInorder(root,inoder);

//        sorted Inorder Sequence --> balanced BST
        root = createBST(inoder,0,inoder.size()-1);
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = Convert_BSt(root);
        preoder(root);
        System.out.println();
        inorder(root);

    }
    public static void preoder(Node root){
        if (root==null){
            return;
        }
        System.out.println(root.val + " ");
        preoder(root.left);
        preoder(root.right);
    }
    public static void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.val + " ");
        inorder(root.right);
    }
}
