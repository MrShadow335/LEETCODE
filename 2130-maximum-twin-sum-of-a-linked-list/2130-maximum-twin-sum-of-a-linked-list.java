
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<ListNode> ans = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            ans.add(temp);
            temp = temp.next;
        }
        int sum = 0;
        int twSum = 0;
        int n = ans.size()-1;
        int i = 0, j= n;
        while(i<j){
            sum = ans.get(i).val + ans.get(j).val;
            if(twSum < sum){
                twSum = sum;
                sum = 0;
            }
            i++;
            j--;
        }
        return twSum;
    }
}