/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return null;
        int len =1;
        ListNode curr = head, orighead = head, tail = null, newhead = null;
        while(curr.next!=null){
            len++;
            curr = curr.next;
        }
        tail = curr;
        curr = head;
        k = k%len;
        if(k == 0)
            return head;
        for(int i=1;i<len-k;i++)
            curr = curr.next;
        head = curr.next;
        curr.next = null;
        tail.next = orighead;
        return head;
    }
}