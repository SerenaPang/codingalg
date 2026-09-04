package alg.linkedlist;

public class ReverseLinkedListRecursive {
    public Node reverse(Node head) {
      if (head == null || head.next == null) {
        return head;
      }
      Node newHead = reverse(head.next);
      head.next.next = head;
      head.next = null;
      return newHead;
    }
}
