
class Solution {
    public ListNode reverseList(ListNode head) {
        // ListNode temp = head;
        // if(head == null) return null;
        // ArrayList<ListNode> ans = new ArrayList<>();
        // while(temp != null){
        //     ans.add(temp);
        //     temp = temp.next;
        // }
        // int n = ans.size();
        // for(int i = n-1; i>=1; i--){
        //     ans.get(i).next = ans.get(i-1);
        // }
        // ans.get(0).next = null;
        // return ans.get(n-1);

        //OPTIMAL
        // ListNode prev = null;
        // ListNode forw = null;
        // ListNode curr = head;
        // while(curr != null){
        //     forw = curr.next;
        //     curr.next = prev;
        //     prev=curr;
        //     curr = forw;
        // }
        // return prev;

        //RECURSION
        if(head == null || head.next == null) return head;
        ListNode a = head.next;
        head.next = null;
        ListNode b = reverseList(a);
        a.next = head;
        return b;
    }
}