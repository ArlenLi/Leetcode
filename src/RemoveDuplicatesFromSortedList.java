/**
 * Created by lld on 16/8/17.
 */

/*
* tips:
* 1. considering the situation that the list is empty
* 2. be careful with the loop condition(current node is null or next node is null)
* 3. be careful with the last node
* */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode temp = new ListNode(0);
        ListNode beforehead = new ListNode(0);
        beforehead.next = head;
        temp = head;
        while(head != null) {
            if (head.val == temp.val) {
                head = head.next;
                continue;
            } else {
                temp.next = head;
                temp = head;
                head = head.next;
            }
        }
        temp.next = null;
        return beforehead.next;
    }
}
