/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        int lena = 0, lenb = 0;
        ListNode curr1 = headA;
        while(curr1!=null){
            lena++;
            curr1 = curr1.next;
        }
        ListNode curr2 = headB;
        while(curr2!=null){
            lenb++;
            curr2 = curr2.next;
        }
        curr1 = headA;
        curr2 = headB;
        if(lena>lenb){
            for(int i=0;i<(lena-lenb);i++)
                curr1 = curr1.next;
        }
        else{
            for(int i=0;i<(lenb-lena);i++)
                curr2 = curr2.next;
        }
        while(curr1!=null){
            if(curr1 == curr2)
                return curr1;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return null;
    }
}