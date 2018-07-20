/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head!=null && head.next!=null){
	    ListNode slow = head, fast = head.next;
	    while(fast!=null && fast.next!=null){
		slow = slow.next;
		fast = fast.next.next;
	    }
	    System.out.println(slow.val);
	    fast = reverse(slow);
	    slow = head;
	    while(slow!=null && fast!=null){
		ListNode start = slow.next;
		slow.next = fast;
		ListNode end = fast.next;
		fast.next = start;
		slow = fast.next;
		fast = end;
	    }
        }
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null, temp = null;
        while(head!=null){
            temp= head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
    
}