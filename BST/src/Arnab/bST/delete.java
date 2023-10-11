package Arnab.bST;

public class delete {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static Node Delete(Node root , int data){
        if (root==null)
            return null;
        if (root.val <data){
            root.right = Delete(root.right , data);
        }
        else if (root.val>data){
            root.left = Delete(root.left,data);
        }
        else {
//            case1: leaf node
            if (root.left == null && root.right == null){
                return null;
            }
//            case2 : single child
             if (root.left == null){
                 return root.right;
             }else if (root.right == null){
                 return root.left;
             }
//             case3 : for 2 child & inorder Successor
            Node Is = findInorderSuccessor(root.right);
             root.val = Is.val;
             root.right = Delete(root.right , Is.val);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null){
            root = root.left;
        }
        return root;
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
//        this use for null testcase
        int values1[] = {};
        int values[] = {8,5,3,1,4,6,10,11,14};
            Node root =null;
            for (int i = 0; i < values.length; i++) {
                root = insert(root, values[i]);
            }
         root= Delete(root,0);
            inorder(root);
        System.out.println();
        }
    }

