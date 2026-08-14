class Solution {

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode forw = null;
        ListNode curr = head;

        while (curr != null) {
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }

        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        temp1 = reverse(temp1);
        temp2 = reverse(temp2);

        int carry = 0;

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (temp1 != null || temp2 != null) {

            int val1 = 0;
            int val2 = 0;

            if (temp1 != null) {
                val1 = temp1.val;
            }

            if (temp2 != null) {
                val2 = temp2.val;
            }

            int sum = val1 + val2 + carry;

            carry = sum / 10;
            sum = sum % 10;

            temp.next = new ListNode(sum);
            temp = temp.next;

            if (temp1 != null) {
                temp1 = temp1.next;
            }

            if (temp2 != null) {
                temp2 = temp2.next;
            }
        }
        if (carry != 0) {
            temp.next = new ListNode(carry);
        }
        return reverse(dummy.next);
    }
}