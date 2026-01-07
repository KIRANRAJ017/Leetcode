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
    long sum, tot=0, max=0;
    public int maxProduct(TreeNode root) {
        tot=get(root);
        get(root);
        return (int)(max%(int)(1e9+7));
    }
    private long get(TreeNode root){
        if(root==null) return 0;
        sum=root.val+get(root.left)+get(root.right);
        max=Math.max(max, sum*(tot-sum));
        return sum;
    } 
}