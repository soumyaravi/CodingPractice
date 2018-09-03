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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructTree(0, nums.length-1, nums);
    }
    TreeNode constructTree(int start, int end, int nums[]){
        if(start>end)
            return null;
        //find max in array
        int max = start;
        for(int i=start+1;i<=end;i++){
            max = nums[max]<nums[i]?i:max;
        }
        TreeNode node = new TreeNode(nums[max]);
        node.left = constructTree(start, max-1, nums);
        node.right = constructTree(max+1, end, nums);
        return node;
    }
}