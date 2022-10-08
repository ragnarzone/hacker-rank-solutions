package datastructures.linkedlists;

public class PrintTheElementsOfLinkedList {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    // Solution
    static void printLinkedList(SinglyLinkedListNode head) {
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
