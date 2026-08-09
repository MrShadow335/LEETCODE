
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        if(head == null) return null;
        ArrayList<ListNode> ans = new ArrayList<>();
        while(temp != null){
            ans.add(temp);
            temp = temp.next;
        }
        int n = ans.size();
        for(int i = n-1; i>=1; i--){
            ans.get(i).next = ans.get(i-1);
        }
        ans.get(0).next = null;
        return ans.get(n-1);
    }
}