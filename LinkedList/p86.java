/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null)
            return head;
        ListNode start = null, low = null, high = null, end = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = null;
            if(head.val < x){
                if(start == null){
                    start = head;
                    low = start;
                }
                else{
                    low.next = head;
                    low = head;
                }
            }
            else{
                if(end == null){
                    end = head;
                    high = end;
                }
                else{
                    high.next = head;
                    high = head;
                }
            }
            head = next;
        }
        if(start == null)
            return end;
        low.next = end;
        return start;
    }
}