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
    public List<Integer> postorderTraversal(TreeNode root) {
 
        ArrayList<Integer> res = new ArrayList<>();
        postorder(res,root);
        return res;
    }
    public void postorder(ArrayList<Integer> res, TreeNode root){
        if(root!=null){
            postorder(res,root.left);
            postorder(res,root.right);
            res.add(root.val);
        }
    }
}