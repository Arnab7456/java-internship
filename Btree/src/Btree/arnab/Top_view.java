package Btree.arnab;
import java.util.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Top_view {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Topview(root);
    }

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class INFO {
        Node node;
        int Hd;

        public INFO(Node node, int hd) {
            this.node = node;
            this.Hd = hd;
        }
    }

    public static void Topview(Node root) {
        Queue<INFO> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;
        q.add(new INFO(root, 0));
        q.add(null);
        while (!q.isEmpty()) {
            INFO curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }

            else{
                if (!map.containsKey(curr.Hd)) {
//                         first time occurring
                    map.put(curr.Hd, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new INFO(curr.node.left, curr.Hd - 1));
                    min = Math.min(min, curr.Hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new INFO(curr.node.right, curr.Hd + 1));
                    max = Math.max(max, curr.Hd + 1);
                }
            }
            }
            for (int i = min; i <= max; i++) {
                System.out.println(map.get(i).data + " ");
            }
            System.out.println();
        }

    }

