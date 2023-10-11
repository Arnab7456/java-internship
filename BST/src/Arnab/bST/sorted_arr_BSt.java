package Arnab.bST;

import java.util.ArrayList;

public class sorted_arr_BSt {
    public static void main(String[] args) {
        int[] arr = {3,5,6,8,10,11,12};
        Node root = Sorted_Arr(arr,0,arr.length-1);
        preoder(root);
    }
    static class Node {
        int val ;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left=null;
            this.right=null;
        }
    }
    public static Node Sorted_Arr(int[] arr, int st , int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left = Sorted_Arr(arr , st,mid-1); // assign the result to the left child
        root.right = Sorted_Arr(arr,mid+1,end); // assign the result to the right child
        return root;
    }

    public static void preoder(Node root){
        if (root==null){
            return;
        }
        System.out.println(root.val + " ");
        preoder(root.left);
        preoder(root.right);
    }

}
