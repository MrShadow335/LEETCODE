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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode a = slow.next;
        slow.next = null;
        ListNode head2 = reverse(a);
        ListNode x = head;
        ListNode y = head2;
        while(x != null && y != null){
            if(x.val == y.val){
                x = x.next;
                y=y.next;
            }
            else return false;
        }
        return true;
    }
}