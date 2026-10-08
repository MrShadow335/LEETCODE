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
    public ListNode removeNthFromEnd(ListNode head, int k) {
        int len = 0;
        ListNode temp = head;
        if(head.next == null) return null;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        if(k==len) return head.next;
        temp = head;
        for(int i=1; i<len-k; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}