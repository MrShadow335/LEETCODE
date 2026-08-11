
class Solution {
    public ListNode reverseBetween(ListNode head, int a, int b) {
        ArrayList<ListNode> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            arr.add(temp);
            temp = temp.next;
        }
        int i = a-1, j=b-1;
        while(i<j){
            ListNode t1 = arr.get(i);
            ListNode t2 = arr.get(j);
            arr.set(i,t2);
            arr.set(j,t1);
            i++;
            j--;
        }
        for(i=0; i<arr.size()-1; i++){
            arr.get(i).next = arr.get(i+1);
        }
        if(i == arr.size()-1) {
                arr.get(i).next =  null;
            }
        return arr.get(0);
    }
}