package Btree.arnab;

public class height {
    static class Node{
        int data ;
        Node left , right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if (root == null){
            return 0;
        }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh,rh)+1;
    }
//    check the given tree is balanced or not
    public static boolean isBalanced(Node root) {
        if (root==null){
            return true;
        }
        else if (Math.abs(height(root.left)-height(root.right))>1){
            return false;
        }
        else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
    public static int countNode(Node root){
        if (root == null){
            return 0;
        }
        int lc = countNode(root.left);
        int rc = countNode(root.right);
        return lc + rc + 1;
    }

    public static void main(String[] args) {
                /*
                    1
                   / \
                  2   3
                 / \ / \
                4  5 6  7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(height(root));

        System.out.println(isBalanced(root));
        System.out.println(countNode(root));
    }
}
