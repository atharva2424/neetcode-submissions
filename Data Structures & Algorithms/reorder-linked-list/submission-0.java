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
    public void add(ListNode curr, ListNode node)
    {
        curr.next = node;
        node.next = null;
    }
    public void reorderList(ListNode head) {
        TreeMap<Integer, ListNode> map = new TreeMap<>();
        ListNode curr = head;
        int index = 0;
        while(curr!=null)
        {
            map.put(index, curr);
            index++;
            curr = curr.next;
        }
        ListNode newNode = new ListNode(-1);
        curr = newNode;
        Integer keys[] = map.keySet().toArray(new Integer[0]);
        int l = 0, r = keys.length-1;
        while(l<=r)
        {
            add(curr, map.get(l));
            l++;
            curr = curr.next;
            add(curr, map.get(r));
            r--;
            curr = curr.next;
        } 
        head = newNode.next;
    }
}
