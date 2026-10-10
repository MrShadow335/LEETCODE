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
        ListNode curr = head;
        ListNode forw = null;
        while(curr != null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode t1, ListNode t2) {
        //ListNode t1 = reverse(l1);
        //ListNode t2 = reverse(l2);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry =0;
        while(t1 != null || t2 != null){
            int sum = carry;
            if(t1 != null){
                sum += t1.val;
                t1=t1.next;
            }
            if(t2 != null){
                sum += t2.val;
                t2 = t2.next;
            }
            carry = sum/10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }
        if(carry > 0){
            temp.next = new ListNode(carry);
            temp = temp.next;
        }
        //ListNode ans = reverse(dummy.next);
        return dummy.next;
    }                            
}