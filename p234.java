/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return true;
        ListNode curr = head.next;
        int res = head.val;
        while(curr!=null){
            res = res ^ curr.val;
            curr = curr.next;
        }
        if(res == 0)
            return true;
        else
            return false;
    }
}