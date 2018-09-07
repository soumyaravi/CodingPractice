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
    public boolean leafSimilar2(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null)
            return false;
        ArrayList<Integer> l1 = findLeaf(root1, new ArrayList<Integer>());
        ArrayList<Integer> l2 = findLeaf(root2, new ArrayList<Integer>());
        return l1.equals(l2);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null)
            return false;
        ArrayList<Integer> l1 = findLeaf(root1, new ArrayList<Integer>());
        ArrayList<Integer> l2 = findLeaf(root2, new ArrayList<Integer>());
        // System.out.println(l1.size()  +" " + l2.size());
        if(l1.size()!=l2.size())
            return false;
        for(int i=0;i<l1.size();i++){
            if(l1.get(i) != l2.get(i))
                return false;
            // System.out.println(l1.get(i)  +" " + l2.get(i));
        }
        return true;
    }
    ArrayList<Integer> findLeaf(TreeNode n, ArrayList<Integer> l){
        if(n == null)
            return l;
        if(n.left == null && n.right == null){
            l.add(n.val);
            // System.out.println(n.val);
            return l;
        }
        findLeaf(n.left, l);
        findLeaf(n.right, l);
        return l;
    }
}