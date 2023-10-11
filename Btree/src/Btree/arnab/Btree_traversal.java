package Btree.arnab;

public class Btree_traversal {

        public static void main(String[] args) {
            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Binarytree tree = new Binarytree();
            Node root = tree.buildtree(nodes);
            System.out.println("preoder traversal");
            tree.preoder(root);
            System.out.println("inoder traversal");
            tree.inoder(root);
            System.out.println("postoder traversal");
            tree.postoder(root);
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
            public static void preoder(Node root){
                if (root==null){
                    return;
                }
                System.out.println(root.data + "");
                preoder(root.left);
                preoder(root.right);
            }
            public static void inoder(Node root){
                if (root == null){
                    return;
                }
                inoder(root.left);
                System.out.println(root.data+"");
                inoder (root.right);
            }
            public static void postoder(Node root){
                if (root == null){
                    return;
                }
                postoder(root.left);
                postoder(root.right);
                System.out.println(root.data + " ");
            }
        }
    }
