/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode first = head, second = head;
        while(second.next!=null){
            first = first.next;
            second = second.next.next;
            if(second == null)
                return first;
        }
        return first;
    }
}