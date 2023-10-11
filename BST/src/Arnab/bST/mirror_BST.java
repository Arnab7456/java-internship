package Arnab.bST;

public class mirror_BST {
    public static void main(String[] args) {
        /*
                8
               / \
              5   10
             / \    \
            3   6    11

                8
               / \
              10   5
             /    / \
            11    6   3
         */
            Node root = new Node(8);
            root.left = new Node(5);
            root.right = new Node(10);
            root.left.left = new Node(3);
            root.left.right = new Node(6);
            root.right.right = new Node(11);

            isSymmetric(root);
            preoder(root);

    }
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static Node mirror(Node root){
        if (root==null){
            return null;
        }
        Node leftSubtree = mirror(root.left);
        Node rightSubtree = mirror(root.right);

        root.left = rightSubtree;
        root.right = leftSubtree;

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
    public static boolean isSymmetric(Node root) {
        if (root == null) return true;

        return check(root.left, root.right);
    }
    public static boolean check(Node leftsub , Node rightsub){
        if (leftsub == null && rightsub == null)
            return true;
        if (leftsub == null || rightsub==null || leftsub.val !=rightsub.val)
            return false;
        return check(leftsub.left , rightsub.right) && check(leftsub.right , rightsub.left);
    }

}
