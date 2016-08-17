/**
 * Created by lld on 16/8/7.
 */

/**
 * Tips: Applying algorithm to two lists, two arrays or others, firstly judging if they are all empty!!!
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode startPoint = new ListNode(0);
        ListNode result = new ListNode(0);
        startPoint.next = result;

        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                result.next = l1;
                result = result.next;
                l1 = l1.next;
            } else {
                result.next = l2;
                result = result.next;
                l2 = l2.next;
            }
        }

        if (l1 == null) {
            while(l2 != null) {
                result.next = l2;
                result = result.next;
                l2 = l2.next;
            }
        } else {
            while(l1 != null) {
                result.next = l1;
                result = result.next;
                l1 = l1.next;
            }
        }
        return startPoint.next.next;
    }

    // Use recursion to solve this problem
    public ListNode mergeTwoListsUsingRecursion(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode result = null;

        if (l1.val < l2.val) {
            result = l1;
            result.next = mergeTwoListsUsingRecursion(l1.next, l2);
        } else {
            result = l2;
            result.next = mergeTwoListsUsingRecursion(l1, l2.next);
        }

        return result;
    }
}
