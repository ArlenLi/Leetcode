/**
 * Created by lld on 16/8/7.
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        } else {
            ListNode startPoint = new ListNode(0);
            ListNode first = head;
            ListNode second = head.next;
            head = null;
            ListNode temp = startPoint;
            while (first != null && second != null) {
                first.next = second.next;
                second.next = first;
                temp.next = second;
                temp = first;
                first = first.next;
                if (first != null) {
                    second = first.next;
                } else {
                    second = null;
                }
            }
            return  startPoint.next;
        }
    }

    // refactoring version
    public ListNode swapPairsRefactor(ListNode head) {
        ListNode startPoint = new ListNode(0);
        startPoint.next = head;
        head = startPoint;
        ListNode first = null;
        ListNode second = null;
        while(head.next != null && head.next.next != null) {
            first = head.next;
            second = head.next.next;
            first.next = second.next;
            second.next = first;
            head.next = second;
            head = first;
        }
        return startPoint.next;
    }
}
