package datastructures.linkedlists;

import java.io.*;
import java.util.stream.IntStream;

public class DeleteANode {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    static class SinglyLinkedListPrintHelper {
        public static void printList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
            while (node != null) {
                bufferedWriter.write(String.valueOf(node.data));

                node = node.next;

                if (node != null) {
                    bufferedWriter.write(sep);
                }
            }
        }
    }

    static class Result {

        public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
            if(llist == null){
                return null;
            } else if (position == 0){
                return llist.next;
            } else {
                SinglyLinkedListNode n = llist;
                for (int i = 0; i < position - 1; i++) {
                    n = n.next;
                }
                n.next = n.next.next;
                return llist;
            }
        }

    }

    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            SinglyLinkedList llist = new SinglyLinkedList();

            int llistCount = Integer.parseInt(bufferedReader.readLine().trim());

            IntStream.range(0, llistCount).forEach(i -> {
                try {
                    int llistItem = Integer.parseInt(bufferedReader.readLine().trim());

                    llist.insertNode(llistItem);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            int position = Integer.parseInt(bufferedReader.readLine().trim());

            SinglyLinkedListNode llist1 = Result.deleteNode(llist.head, position);

            SinglyLinkedListPrintHelper.printList(llist1, " ", bufferedWriter);
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
}
