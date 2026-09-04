package alg.linkedlist;

public class InsertInSortedLinkedList {
    public Node insert(Node head, int value){
        Node newHead = head;
        Node pre = head;
        Node newNode = new Node(value);
        if (head == null ||  head.value > value){
            newNode.next = head;
            newHead = newNode;
            return newHead;
        }
        while (head != null && head.value < value) {
            head = head.next;
            pre = head;
        }
        if (pre.next != null){
            pre.next = newNode;
            newNode.next = head;
        }else{
            pre.next = newNode;
        }
        return newHead;
    }
}
