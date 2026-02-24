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
    static int sum;
    public int sumRootToLeaf(TreeNode root) {
        sum=0;
        dfs(root, "");
        return sum;
    }
    static void dfs(TreeNode root, String s){
        if(root==null) return;
        s+=Integer.toString(root.val);
        // System.out.print(s+" ");
        if(root.left==null && root.right==null){
            sum+=Integer.parseInt(s, 2);
            s=s.substring(0, s.length()-1);
        }
        // System.out.println(sum);
        dfs(root.left, s);
        dfs(root.right, s);
    }
}