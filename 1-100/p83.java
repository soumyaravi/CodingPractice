/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
            if(curr.val == curr.next.val){
                //delete node
                curr.val = curr.next.val;
                curr.next = curr.next.next;
            }
            else
                curr = curr.next;
        }
        return head;
    }
}