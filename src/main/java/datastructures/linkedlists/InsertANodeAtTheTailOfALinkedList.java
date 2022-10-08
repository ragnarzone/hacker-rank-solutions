package datastructures.linkedlists;

public class InsertANodeAtTheTailOfALinkedList {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    // Solution
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if (head == null){
            return new SinglyLinkedListNode(data);
        } else {
            SinglyLinkedListNode tail = head;
            while(tail.next != null){
                tail = tail.next;
            }
            tail.next = new SinglyLinkedListNode(data);
        }
        return head;
    }
}
