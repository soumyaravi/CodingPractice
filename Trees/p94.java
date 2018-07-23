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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        inorder(res,root);
        return res;
    }
    public void inorder(ArrayList<Integer> res, TreeNode root){
        if(root!=null){
            inorder(res,root.left);
            res.add(root.val);
            inorder(res,root.right);
        }
    }
}