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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        preorder(res,root);
        return res;
    }
    public void preorder(ArrayList<Integer> res, TreeNode root){
        if(root!=null){
            res.add(root.val);
            preorder(res,root.left);
            preorder(res,root.right);
        }
    }
}