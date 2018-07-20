/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode copy = null, curr = head, curr2 = null;
        HashMap<RandomListNode,RandomListNode> map = new HashMap<>();
        while(curr!=null){
            RandomListNode n = new RandomListNode(curr.label);
            if(copy == null){
                copy = n;
                curr2 = copy;
            }
            else{
                curr2.next = n;
                curr2 = curr2.next;
            }
            map.put(curr, n);
            curr = curr.next;
        }
        curr = head;
        curr2 = copy;
        while(curr!=null){
            RandomListNode pointer = curr.random;
            if(pointer!=null)
                curr2.random = map.get(pointer);
            curr = curr.next;
            curr2 = curr2.next;
        }
        return copy;
    }
}