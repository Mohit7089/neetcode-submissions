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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> list=new ArrayList<>();
        while(l1!=null)
        {
            list.add(l1.val);
            l1=l1.next;
        }
         Collections.reverse(list);
         int num=0;
         for(int x : list)
         {
            num=num*10+x;
         }
         list.clear();
         while(l2!=null)
         {
            list.add(l2.val);
            l2=l2.next;
         }
         Collections.reverse(list);
         int num1=0;
         for(int x : list)
         {
            num1=num1*10+x;
         }
         list.clear();
         StringBuilder sb = new StringBuilder(String.valueOf(num+num1));
         sb.reverse();
         ListNode head=new ListNode(sb.charAt(0)-'0');
         ListNode curr=head;
         for(int i=1;i<sb.length();i++)
         {
            curr.next=new ListNode(sb.charAt(i)-'0');
            curr=curr.next;
         }

        return head;
    }
}