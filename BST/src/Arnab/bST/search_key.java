package Arnab.bST;

public class search_key {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
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
        System.out.println(root.val+"");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[] = {5,1,3,4,7};
        Node root =null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        if (serach(root,1)){
            System.out.println("found");
        }else {
            System.out.println("not found");
        }

    }
    public static boolean  serach(Node root , int key) {
        if (root == null){
            return false;
        }
        if (root.val==key){
            return true;
        }
        if (root.val > key){
            return serach(root.left,key);
        }else {
            return serach(root.right,key);
        }
    }
}
