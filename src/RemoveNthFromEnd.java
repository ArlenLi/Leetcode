/**
 * Created by lld on 16/8/2.
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;
        ListNode priorToSecond = second;
        if(head.next == null) {
            return null;
        }

        for (int i = 1; i <= n; i++) {
            first = first.next;
        }

         while(first != null) {
             first = first.next;
             priorToSecond = second;
             second = second.next;
         }


        if (second.next == null) {
            priorToSecond.next = null;
            return head;
        } else if(second == head) {
            return head.next;
        } else {
            priorToSecond.next = second.next;
            return head;
        }
    }
}
