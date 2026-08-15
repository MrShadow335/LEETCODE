/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null) return head;
        Node curr = head;
        while(curr != null){
            if(curr.child == null) curr = curr.next;
            else{
                Node forw = curr.next;
                Node c = flatten(curr.child);
                curr.child = null;
                curr.next = c;
                c.prev = curr;
                Node temp = c;
                while(temp.next != null) temp = temp.next;
                temp.next = forw;
                if(forw != null) forw.prev = temp;
                curr = forw;
            }
        }
        return head;
    }
}