/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode merge(ListNode head1, ListNode head2) {

        ListNode i = head1;
        ListNode j = head2;

        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;

        while (i != null && j != null) {

            if (i.val <= j.val) {
                k.next = i;
                i = i.next;
            } else {
                k.next = j;
                j = j.next;
            }

            k = k.next;
        }

        // Attach the remaining nodes
        if (i == null) {
            k.next = j;
        } else {
            k.next = i;
        }

        return dummy.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {

        ListNode ans = null;

        for (int i = 0; i < lists.length; i++) {
            ans = merge(ans, lists[i]);
        }

        return ans;
    }
}