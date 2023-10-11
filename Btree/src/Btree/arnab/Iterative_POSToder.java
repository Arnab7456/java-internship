package Btree.arnab;
import java.util.*;

public class Iterative_POSToder {
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public ArrayList<Integer> postOrderTrav(Node curr) {
        ArrayList<Integer> postOrder = new ArrayList<>();
        if (curr == null) return postOrder;

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(curr);
        while (!s1.isEmpty()) {
            curr = s1.peek();
            s1.pop();
            s2.push(curr);
            if (curr.left != null)
                s1.push(curr.left);
            if (curr.right != null)
                s1.push(curr.right);
        }
        while (!s2.isEmpty()) {
            postOrder.add(s2.peek().data);
            s2.pop();
        }
        return postOrder;
    }

    public static void main(String[] args) {
        Iterative_POSToder iterativePOSToder = new Iterative_POSToder();

        Node root = iterativePOSToder.new Node(1);
        root.left = iterativePOSToder.new Node(2);
        root.right = iterativePOSToder.new Node(3);
        root.left.left = iterativePOSToder.new Node(4);
        root.left.right = iterativePOSToder.new Node(5);
        root.left.right.left = iterativePOSToder.new Node(8);
        root.right.left = iterativePOSToder.new Node(6);
        root.right.right = iterativePOSToder.new Node(7);
        root.right.right.left = iterativePOSToder.new Node(9);
        root.right.right.right = iterativePOSToder.new Node(10);

        ArrayList<Integer> postOrder = iterativePOSToder.postOrderTrav(root);

        System.out.println("The postOrder Traversal is : ");
        for (int i = 0; i < postOrder.size(); i++) {
            System.out.print(postOrder.get(i) + " ");
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) return levels;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int floor = 0;
        while (!queue.isEmpty() ) {

            levels.add(new ArrayList<>());

            int level_length = queue.size();
            for(int i = 0; i < level_length; i++) {
                Node node = queue.remove();
                levels.get(floor).add(node.data);

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            floor++;
        }
        return levels;
    }

}
