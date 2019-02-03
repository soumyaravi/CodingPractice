/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null, curr = result;
        int carry = 0, total, num;
        while(l1!=null && l2!=null){
            total = l1.val + l2.val + carry;
            num = total%10;
            carry = total/10;
            ListNode n = new ListNode(num);
            if(result == null){
                curr = n;
                result = curr;
            }
            else{
                curr.next = n;
                curr = curr.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            total = l1.val + carry;
            num = total%10;
            carry = total/10;
            ListNode n = new ListNode(num);
            curr.next = n;
            curr = curr.next;
            l1 = l1.next;
        }
        while(l2!=null){
            total = l2.val + carry;
            num = total%10;
            carry = total/10;
            ListNode n = new ListNode(num);
            curr.next = n;
            curr = curr.next;
            l2 = l2.next;
        }
        if(carry!=0){
            ListNode n = new ListNode(carry);
            curr.next = n;
            curr = curr.next;
        }
        return result;
    }
}