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
    public boolean hasCycle(ListNode head) {
        ListNode l,r;
        l=head; 
        r=head;
        if(head==null) return false;
        while(r!=null && r.next!=null )
        {
           l=l.next;
           r=r.next.next;
           if(l==r) return true;
        }
        return false;
    }
}
