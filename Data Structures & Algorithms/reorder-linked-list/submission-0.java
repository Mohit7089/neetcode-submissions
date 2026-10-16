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
    public void reorderList(ListNode head) {
        ListNode t,temp,p;
        p=t=temp=head;
        int count=0;
        while(t!=null)
        {
            count++;
            t=t.next;
        }
        t=head;
        for(int i=0;i<count/2;i++)
        {
            for(int j=0;j<count-1;j++)
            {
                temp=temp.next;
            }
             p=p.next;
            t.next=temp;
            temp.next=p;
            t=p;
            temp=head;
        }
        p.next=null;
        
    }
}


