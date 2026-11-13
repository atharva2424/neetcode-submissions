/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
        return head;
        Node curr = head, newHead = new Node(head.val), newCurr = newHead;
        HashMap<Node, Node> map = new HashMap<>();
        while(curr!=null)
        {
            map.put(curr, newCurr);
            if(curr.next!=null)
            newCurr.next = new Node(curr.next.val);
            // if(curr.random!=null)
            // newCurr.random = new Node(curr.random.val);
            curr = curr.next;
            newCurr = newCurr.next;
        }
        curr = head;
        newCurr = newHead;
        while(curr!=null)
        {
            newCurr.random = curr.random==null?null:map.get(curr.random);
            curr = curr.next;
            newCurr = newCurr.next;
        }
        return newHead;
    }
}
