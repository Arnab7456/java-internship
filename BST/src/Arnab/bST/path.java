package Arnab.bST;

import java.util.ArrayList;

public class path {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static void printPaths(ArrayList<Integer> path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.println("NULL");
    }
    public static void Root2leaf(Node root , ArrayList<Integer> path){
            if (root==null){
                return;
            }
        path.add(root.val);
        if (root.left == null && root.right==null){
            printPaths(path);
        }
        Root2leaf(root.left,path);
        Root2leaf(root.right,path);
        path.remove(path.size()-1);
    }

    public static Node insert(Node root , int data){
        if (root==null){
            root = new Node(data);
            return root;
        }
        if (root.val>data){
            root.left= insert(root.left,data);
        }else {
            root.right=insert(root.right,data);
        }
        return root;
    }
    public static void inorder(Node root) {
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root=insert(root,values[i]);
        }
//        inorder(root);
//        System.out.println();
        Root2leaf(root,new ArrayList<>());
    }
}
