package Btree.arnab;

public class main_1 {
    public static void main(String[] args) {
    int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    Binarytree tree = new Binarytree();
    Node root = tree.buildtree(nodes);
        System.out.println(root.data);
    }
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    static  class Binarytree{
        static int indx = -1;
        public static Node buildtree(int nodes[]){
            indx++;
            if (nodes[indx] == -1){
                return null;
            }
            Node newnode = new Node(nodes[indx]);
            newnode.left = buildtree(nodes);
            newnode.right=buildtree(nodes);
            return newnode;
        }
    }
}
