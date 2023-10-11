package Btree.arnab;

import java.util.*;

public class Postoder_1Stack {
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
    public ArrayList<Integer> postOrderTrav(Node cur) {
        ArrayList < Integer > postOrder = new ArrayList < > ();
        if (cur == null) return postOrder;

        Stack < Node > st = new Stack < > ();
        while (cur != null || !st.isEmpty()) {

            if (cur != null) {
                st.push(cur);
                cur = cur.left;
            } else {
                Node temp = st.peek().right;
                if (temp == null) {
                    temp = st.peek();
                    st.pop();
                    postOrder.add(temp.data);
                    while (!st.isEmpty() && temp == st.peek().right) {
                        temp = st.peek();
                        st.pop();
                        postOrder.add(temp.data);
                    }
                } else cur = temp;
            }
        }
        return postOrder;

    }
    public static void main(String[] args) {
        Postoder_1Stack Postoder_1Stack = new Postoder_1Stack();
        Node root = Postoder_1Stack.new Node(1);
        root.left = Postoder_1Stack.new Node(2);
        root.right = Postoder_1Stack.new Node(3);
        root.left.left = Postoder_1Stack.new Node(4);
        root.left.right = Postoder_1Stack.new Node(5);
        root.left.right.left = Postoder_1Stack.new Node(8);
        root.right.left = Postoder_1Stack.new Node(6);
        root.right.right = Postoder_1Stack.new Node(7);
        root.right.right.left = Postoder_1Stack.new Node(9);
        root.right.right.right = Postoder_1Stack.new Node(10);

        ArrayList < Integer > postOrder = new ArrayList < > ();
        postOrder = Postoder_1Stack.postOrderTrav(root);

        System.out.println("The postOrder Traversal is : ");
        for (int i = 0; i < postOrder.size(); i++) {
            System.out.print(postOrder.get(i) + " ");
        }
    }
}
