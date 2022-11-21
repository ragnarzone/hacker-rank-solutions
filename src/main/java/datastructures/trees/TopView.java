package datastructures.trees;

import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TopView {
    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static class Solution {


        public static void topView(Node root) {
            LinkedList<Node> nextToVisitNode = new LinkedList<>();
            LinkedList<Integer> nextToVisitLevel = new LinkedList<>();
            Map<Integer, Integer> topView = new TreeMap<>();

            nextToVisitNode.add(root);
            nextToVisitLevel.add(0);

            while(!nextToVisitNode.isEmpty()) {
                Node current = nextToVisitNode.remove();
                int level = nextToVisitLevel.remove();
                if (!topView.containsKey(level)) {
                    topView.put(level, current.data);
                }

                if (current.left != null) {
                    nextToVisitNode.add(current.left);
                    nextToVisitLevel.add(level - 1);
                }
                if (current.right != null) {
                    nextToVisitNode.add(current.right);
                    nextToVisitLevel.add(level + 1);
                }
            }

            for(Integer value : topView.values()){
                System.out.print(value + " ");
            }
        }

        public static Node insert(Node root, int data) {
            if(root == null) {
                return new Node(data);
            } else {
                Node cur;
                if(data <= root.data) {
                    cur = insert(root.left, data);
                    root.left = cur;
                } else {
                    cur = insert(root.right, data);
                    root.right = cur;
                }
                return root;
            }
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();
            Node root = null;
            while(t-- > 0) {
                int data = scan.nextInt();
                root = insert(root, data);
            }
            scan.close();
            topView(root);
        }
    }
}
