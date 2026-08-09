
class Solution {
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode a = head.next;
        head.next = null;
        ListNode b = reverse(a);
        a.next = head;
        return b;
    }
    public boolean isPalindrome(ListNode head) {
        // ListNode temp = head;
        // ArrayList<Integer> ans = new ArrayList<>();
        // while (temp != null) {
        //     ans.add(temp.val);
        //     temp = temp.next;
        // }
        // int i = 0;
        // int j = ans.size() - 1;
        // while (i < j) {
        //     if (ans.get(i) != ans.get(j))
        //         return false;
        //     i++;
        //     j--;
        // }
        // return true;

        //OPTIMAL
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);
        ListNode i = head;
        ListNode j = head2;
        while(j != null){
            if(j.val != i.val){
                return false;
            }
            j = j.next;
            i= i.next;
        }
        return true;
    }
}