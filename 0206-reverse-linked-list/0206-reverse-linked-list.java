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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        LinkedList<ListNode> nodelist = new LinkedList();
        while(addNode(head, nodelist));

        ListNode node = new ListNode();
        ListNode n = node;
        
        while (nodelist.size() != 0) {
            n.next = nodelist.pollLast();
            n = n.next;
        }
        
        return node.next;
    }
    
    private static boolean addNode(ListNode node, LinkedList list) {
        if(node == null) return false;
        if(node.next != null) {
            ListNode newNode = new ListNode(node.val);
            list.add(newNode);
        } else list.add(node);
        return addNode(node.next, list);
    }
}