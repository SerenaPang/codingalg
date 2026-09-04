package alg.linkedlist;

public class ReverseLinkedListIterative {
     public Node reverse(Node head) {
        Node pre = null;
        while (head!= null) {
            Node next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
  }
}
