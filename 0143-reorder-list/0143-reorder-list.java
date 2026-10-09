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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode forw = null;
        ListNode curr = head;
        while(curr != null){
            forw = curr.next;
            curr.next = prev;
            prev=curr;
            curr = forw;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode k = slow.next;
        slow.next = null;
        ListNode head2 = reverse(k);
        ListNode dummy = new ListNode(-1);
        ListNode a = dummy;
        ListNode b = head;
        ListNode c = head2;
        while(b != null && c != null){
            a.next = b;
            a=b;
            b = b.next;
            a.next = c;
            a=c;
            c=c.next;
        }
        if(b != null) a.next = b;
        else a.next = c;
    }
}