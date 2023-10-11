package Btree.arnab;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class iterative_levelOrder {
    public class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
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

    public static void main(String[] args) {
        iterative_levelOrder iterative_levelOrder = new iterative_levelOrder();
        Node root = iterative_levelOrder. new Node(1);
        root.left = iterative_levelOrder.new Node(2);
        root.right = iterative_levelOrder.new Node(3);
        root.left.left = iterative_levelOrder.new Node(4);
        root.left.right = iterative_levelOrder.new Node(5);
        root.left.right.left = iterative_levelOrder.new Node(8);
        root.right.left = iterative_levelOrder.new Node(6);
        root.right.right = iterative_levelOrder.new Node(7);
        root.right.right.left = iterative_levelOrder.new Node(9);
        root.right.right.right = iterative_levelOrder.new Node(10);

        List<List<Integer>> level = iterative_levelOrder.levelOrder(root);

        System.out.println("The level Traversal is : ");
        for (int i = 0; i < level.size(); i++) {
            System.out.print(level.get(i) + " ");
        }
    }

}
