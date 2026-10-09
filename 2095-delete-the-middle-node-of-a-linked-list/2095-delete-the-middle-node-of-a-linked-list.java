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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){ 
            head=null;
            return head;
        }
        ListNode p1=head;
        ListNode p2=head;
        ListNode prev=null;
        while(true)
        {
            p1=p1.next;
            if(p1==null) break;
             prev=p2;
            p2=p2.next;
            p1=p1.next;
            if(p1==null) break;
        }
        if(p2==null)
            prev.next=null;
        prev.next=p2.next;
        return head;
    }
}