package alg.recursion;

public class ReverseListInPairs {
    public ListNode reverseListInPairs(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = head.next;
        head.next = reverseListInPairs(head.next.next);
        newHead.next = head;
        return newHead;
    }
}
