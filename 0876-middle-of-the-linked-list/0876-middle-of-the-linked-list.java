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
    public ListNode middleNode(ListNode head) {
        if(head == null) return head;
        int count = 0;

        int middleNode = nodeCount(head, count) / 2 + 1;
        int startCnt = 1;

        return returnNode(head, startCnt, middleNode);
    }
    
    private static int nodeCount(ListNode node, int count) {
        if(node == null) return count;
        else {
            count++;
            return nodeCount(node.next, count);
        }
    }

    private static ListNode returnNode(ListNode node, int count, int middleNode) {
        if(count == middleNode) return node;
        else {
            count++;
            return returnNode(node.next, count, middleNode);
        }
    }
}