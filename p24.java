/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode first = dummy, second = first.next;
        while(first.next!=null && first.next.next!=null){
            first.next = second.next;
            ListNode temp = second.next.next;
            second.next.next = second;
            second.next = temp;
            first= first.next.next;
            second = first.next;
        }
        return dummy.next;
    }
}