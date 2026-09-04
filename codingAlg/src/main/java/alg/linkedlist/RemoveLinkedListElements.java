package alg.linkedlist;

public class RemoveLinkedListElements {
    public Node removeElement(Node head, int val){
        if (head.value == val && head.next == null) {
            return head.next;
        }
        Node pre = head;
        while (head != null) {
            if (head.value == val) {
                pre.next = head.next;
            }
            pre = head;
            head = head.next;
        }
        return null;
    }
}
