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
        int sum = 0, carry = 0;
        ListNode c1 = l1, c2 = l2;
        ListNode newHead = new ListNode(-1);
        ListNode newCurr = newHead;
        while(c1!=null && c2 !=null)
        {
            sum = (c1.val + c2.val + carry);
            newCurr.next = new ListNode(sum%10);
            carry = sum/10;
            newCurr = newCurr.next;
            c1 = c1.next;
            c2 = c2.next;
        }
        while(c1!=null)
        {
            sum = (c1.val + carry);
            newCurr.next = new ListNode(sum%10);
            carry = sum/10;
            newCurr = newCurr.next;
            c1 = c1.next;
        }
        while(c2!=null)
        {
            sum = (c2.val + carry);
            newCurr.next = new ListNode(sum%10);
            carry = sum/10;
            newCurr = newCurr.next;
            c2 = c2.next;
        }
        if(carry!=0)
        {
            newCurr.next = new ListNode(carry);
        }
        return newHead.next;
    }
}
