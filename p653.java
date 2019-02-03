/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root == null)
            return false;
        HashSet<Integer> set = new HashSet<>();
        return findNum(root, k, set);
    }
    boolean findNum(TreeNode n, int target, HashSet<Integer> set){
        if(n == null)
            return false;
        if(set.contains(target - n.val))
            return true;
        set.add(n.val);
        return findNum(n.left, target, set) || findNum(n.right, target, set);
    }
}