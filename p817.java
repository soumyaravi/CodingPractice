/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
        if(head == null)
            return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<G.length; i++)
            set.add(G[i]);
        ListNode curr = head;
        int count = 0;
        boolean flag = false;
        while(curr!=null){
            if(set.contains(curr.val))
                flag = true;
            else{
                if(flag)
                    count++;
                flag = false;
            }
            curr = curr.next;
        }
        if(flag == true)
            count++;
        return count;
    }
}