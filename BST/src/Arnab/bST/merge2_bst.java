package Arnab.bST;

import java.util.ArrayList;

public class merge2_bst {
    static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static void getIndorder(Node root , ArrayList<Integer>arr){
        if (root==null){
            return;
        }
        getIndorder(root.left,arr);
        arr.add(root.val);
        getIndorder(root.right,arr);
    }
    public static Node MergeBsts(Node root1 , Node root2){
//        step 1
            ArrayList<Integer> arr1 = new ArrayList<>();
            getIndorder(root1,arr1);
//        step 2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getIndorder(root2,arr2);

//        merge
        int i =0 , j=0;
        ArrayList<Integer> finalarr = new ArrayList<>();
        while (i<arr1.size() && j<arr2.size()){
            if (arr1.get(i)<=arr2.get(j)){
                finalarr.add(arr1.get(i));
                i++;
            }else {
                finalarr.add(arr2.get(j));
                j++;
            }
        }
        while (i<arr1.size()){
            finalarr.add(arr1.get(i));
            i++;
        }
        while (j<arr2.size()){
            finalarr.add(arr2.get(j));
            j++;
        }
//        sorted all bst
        return createBst(finalarr,0,finalarr.size()-1);
    }
    public static Node createBst(ArrayList<Integer> arr , int st , int end){
        if (st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBst(arr,st,mid-1);
        root.right = createBst(arr,mid+1,end);

        return root;
    }
    public static void preoder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val + " ");
        preoder(root.left);
        preoder(root.right);

    }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);


        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = MergeBsts(root1,root2);

        preoder(root);
    }
}
