package Btree.arnab;

public class Diameter {
    /*
        No of nodes in the longest path  between 2 leafs
     */
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int diameterN2(Node root) {
//        O(N2)
        if (root == null) {
            return 0;
        }
        int LeftDiameter = diameterN2(root.left);
        int LeftHeight = height(root.left);
        int RightDiameter = diameterN2(root.right);
        int RightHeight = height(root.right);

        int self = LeftHeight + RightHeight + 1;
        return Math.max(self, Math.max(LeftDiameter, RightDiameter));
    }
    static class INFO {
        int diameter ;
        int height;

        public INFO(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }
    public static INFO diamert(Node root){
        if (root == null){
            return new  INFO(0,0);
        }
        INFO leftInfo = diamert(root.left);
        INFO rightInfo = diamert(root.right);

        int diamert = Math.max(Math.max(leftInfo.diameter , rightInfo.diameter), leftInfo.height + rightInfo.height+1);
        int ht = Math.max(leftInfo.height,rightInfo.height)+1 ;
        return new INFO(diamert , ht);
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
        System.out.println("Approach :=> O(N^2) "+ diameterN2(root));
        System.out.println("linear time complexity :=>"+diamert(root).diameter);
        System.out.println(diamert(root).height);
    }

}
