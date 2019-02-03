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

    //recursive solution
    public List<Double> averageOfLevels2(TreeNode root) {
        if(root == null)
            return new ArrayList<Double>(0);
        List<Double> sum  = new ArrayList<>();
        List<Integer> count  = new ArrayList<>();
        findAvg(root, 0 ,sum, count);
        for(int i=0;i<sum.size();i++)
            sum.set(i,sum.get(i)/count.get(i));
        return sum;
    }
    void findAvg(TreeNode root, int start, List<Double> sum, List<Integer> count){
        if(root == null)
            return;
        if(start<sum.size()){
            sum.set(start,root.val+sum.get(start));
            count.set(start,1+count.get(start));
        }
        else{
            sum.add(1.0*root.val);
            count.add(1);
        }
        findAvg(root.left, start+1 ,sum, count);
        findAvg(root.right, start+1 ,sum, count);
    }

    //iterative solution
    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null)
            return new ArrayList<Double>(0);
        ArrayList<Double> avg = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int prev = 1;
        while(!q.isEmpty()){
            double sum=0;
            int curr = 0;
            for(int i=0;i<prev;i++){
                TreeNode n = q.remove();
                sum+= n.val;
                if(n.left!=null){
                    q.add(n.left);
                    curr++;
                }
                if(n.right!=null){
                    q.add(n.right);
                    curr++;
                }
            }
            avg.add(sum/prev);
            prev = curr;
        }
        return avg;
    }
}