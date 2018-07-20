/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null || (head.next == null && head.val == val)){
            return null;
        }
        ListNode curr = head, prev = null;
        while(curr!=null){
            if(curr == head && curr.val == val){
                head = head.next;
                curr = curr.next;
            }
            else if(curr.val == val){
                System.out.println(curr.val + " " + prev.val);
                if(curr.next == null){
                    prev.next = null;
                    curr = null;
                }
                else{
                    curr.val = curr.next.val;
                    curr.next = curr.next.next;
                    
                }
            }
            else{
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}