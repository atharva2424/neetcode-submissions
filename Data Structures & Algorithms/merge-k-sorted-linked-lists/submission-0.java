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
    public ListNode merge(ListNode head1, ListNode head2)
    {
        ListNode head = new ListNode(-1), curr= head;
        while(head1!=null && head2!=null)
        {
            if(head1.val<=head2.val)
            {
                curr.next = new ListNode(head1.val);
                head1 = head1.next;
            }
            else
            {
                curr.next = new ListNode(head2.val);
                head2 = head2.next;
            }
            curr = curr.next;
        }
        if(head1!=null)
        curr.next = head1;
        if(head2!=null)
        curr.next = head2;
        return head.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
        return null;
        ListNode head1 = null;
        for(ListNode head2 : lists)
        {
            head1 = merge(head1, head2);
        }
        return head1;
    }
}
