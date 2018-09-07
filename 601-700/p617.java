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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null)
            return null;
        else if(t1 == null && t2!=null)
            return t2;
        else if(t1 != null && t2==null)
            return t1;
        else{
            TreeNode node = new TreeNode(t1.val + t2.val);
            node.left = mergeTrees(t1.left, t2.left);
            node.right = mergeTrees(t1.right, t2.right);
            return node;
        }
    }
    public TreeNode mergeTrees2(TreeNode t1, TreeNode t2) {
        if(t1 == null)
            return t2;
        if(t2==null)
            return t1;
        else{
            t1.val +=t2.val;
            t1.left = mergeTrees2(t1.left, t2.left);
            t1.right = mergeTrees2(t1.right, t2.right);
            return t1;
        }
}