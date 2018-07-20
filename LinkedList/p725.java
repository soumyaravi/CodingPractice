/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode result[] = new ListNode[k];

        int len=0;
        ListNode curr = root;
        while(curr!=null){
            len++;
            curr = curr.next;
        }
        curr = root;
        int quo = len/k, rem = len%k;
        for(int i =0; i<k; i++){
            result[i] = curr;
            ListNode head = curr;
            for(int j=0;j<quo+ (i < rem ? 1 : 0)-1;j++){
                if(curr!=null)
                    curr = curr.next;
            }
            if(curr!=null){
                System.out.println(curr.val);
		ListNode temp = curr.next;
		curr.next = null;
		curr = temp;
            }
            result[i] = head;
        }
        return result;
    }
}