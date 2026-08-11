
class Solution {
    public static void reverse(ListNode head){
        ListNode prev = null;
        ListNode forw = null;
        ListNode curr = head;
        while(curr != null){
            forw  = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }

    }
    public ListNode reverseBetween(ListNode head, int a, int b) {
        // ArrayList<ListNode> arr = new ArrayList<>();
        // ListNode temp = head;
        // while(temp != null){
        //     arr.add(temp);
        //     temp = temp.next;
        // }
        // int i = a-1, j=b-1;
        // while(i<j){
        //     ListNode t1 = arr.get(i);
        //     ListNode t2 = arr.get(j);
        //     arr.set(i,t2);
        //     arr.set(j,t1);
        //     i++;
        //     j--;
        // }
        // for(i=0; i<arr.size()-1; i++){
        //     arr.get(i).next = arr.get(i+1);
        // }
        // if(i == arr.size()-1) {
        //         arr.get(i).next =  null;
        //     }
        // return arr.get(0);

        ListNode dummy = new ListNode(-1);
        if(head==null || head.next == null || a==b) return head;
        dummy.next = head;
        ListNode temp = dummy;
        for(int i=1; i<=a-1; i++){
            temp = temp.next;
        }
        ListNode tail1 = temp;
        ListNode head2 = temp.next;
        for(int i=1; i<=b-a+1; i++){
            temp = temp.next;
        }
        ListNode tail2 = temp;
        ListNode head3 = temp.next;
        tail1.next = null;
        tail2.next = null;
        reverse(head2);
        tail1.next  = tail2;
        head2.next = head3;
        return dummy.next;
    }
}