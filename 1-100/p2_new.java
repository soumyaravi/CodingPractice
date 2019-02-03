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
        ListNode head = null, curr = head;
        int carry =0, sum = 0;
        while(l1!=null || l2!=null){
            sum = carry + (l1!=null? L1.val : 0) + (l2!=null ? l2.val : 0);
            int val = sum%10;
            carry = sum/10;
            
            ListNode n = new ListNode(val);
            if(head == null){
                head = n;
                curr = head;
            }
            else{
                curr.next = n;
                curr = curr.next;
            }
            if(l1!=null)
			l1=l1.next;
            if(l2!=null)
			l2=l2.next;
        }
        if(carry!=0){
            ListNode n = new ListNode(carry);
		 n.next=null;
            curr.next = n;
        }
        return head;
    }
}

