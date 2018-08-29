/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null)
            return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = dummy;
        for(int i=1;i<m;i++){
            curr = curr.next;
        }
        ListNode point[] = reverse(curr.next, n-m);
        curr.next = point[0];
        point[1].next = point[2];
        return dummy.next;
    }
    public ListNode[] reverse(ListNode head, int count){
        ListNode ret[] = new ListNode[3];
        ret[1] = head;
        ListNode prev = null, temp = null;
        for(int i=0;i<=count;i++){
            temp= head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        ret[0] = prev;
        ret[2] = temp;
        return ret;
    }
}