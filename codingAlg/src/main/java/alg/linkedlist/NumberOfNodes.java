package alg.linkedlist;

public class NumberOfNodes {
    public int numberOfNodes(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
