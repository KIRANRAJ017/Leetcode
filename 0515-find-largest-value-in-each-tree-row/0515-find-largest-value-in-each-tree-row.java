/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return res;
        q.add(root);
        res.add(root.val);
        while(!q.isEmpty()){
            int s=q.size(), max=Integer.MIN_VALUE;
            while(s-->0){
                root=q.poll();
                if(root.left!=null){
                    q.add(root.left);
                    max=Math.max(max, root.left.val);
                }
                if(root.right!=null){
                    q.add(root.right);
                    max=Math.max(max, root.right.val);
                }
            }
            res.add(max);
        }
        res.remove(res.size()-1);
        return res;
    }
}