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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int l = 1;
        ListNode curr = head;
        while(curr!=null)
        {
            curr = curr.next;
            l++;
        }   
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        head = dummy;
        curr = dummy;
        for(int i = 1;i<l-n;i++)
        {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head.next;
    }
}
