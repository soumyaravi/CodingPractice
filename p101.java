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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return checkTree(root.left, root.right);
        
    }
    boolean checkTree(TreeNode p, TreeNode q){
        if(p == null && q == null)
            return true;
        else if ((p == null && q!= null) || (q == null && p!=null) || (p.val!=q.val))
            return false;
        return checkTree(p.left,q.right) && checkTree(p.right,q.left);
    }
}