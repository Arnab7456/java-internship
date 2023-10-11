package Btree.arnab;

public class subtree_another_tree {
    static class Node{


        int val;
        Node left;
        Node right;
        public Node(int data) {
            this.val = data;
            this.left= null;
            this.right =null;
        }
    }
    public static boolean isIdentical(Node node , Node subnode){
        if (node == null && subnode == null){
            return true;
        } else if (node == null || subnode == null) {
            return false;
        }
        else if (node.val != subnode.val){
                return false;
        } else if (!isIdentical(node.left , subnode.left)) {
            return false;
        }
        else if (!isIdentical(node.right , subnode.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root , Node subroot){
        if (root == null){
            return false;
        }
        if (root.val == subroot.val){
            if (isIdentical(root , subroot)){
                return true;
            }
        }
        boolean Leftans = isSubtree(root.left , subroot);
        boolean rightans = isSubtree(root.right , subroot);

        return Leftans || rightans ;
    }

    public static void main(String[] args) {
          /*
                    1
                   / \
                  2   3
                 / \ / \
                4  5 6  7

                now subtree is
                2
               / \
              4   5

              if we founded write print otherwise -1
           */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println( );
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        System.out.println(isSubtree(root ,subRoot));
    }
}
