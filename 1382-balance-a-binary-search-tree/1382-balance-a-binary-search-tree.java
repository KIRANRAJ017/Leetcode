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
    List<TreeNode> l;
    public TreeNode balanceBST(TreeNode root) {
        l = new ArrayList<>();
        ele(root);
        return add(0, l.size()-1);
    }
    TreeNode add(int st, int en){
        if(st>en) return null;
        int m=(st+en)/2;
        TreeNode node = l.get(m);
        node.left=add(st, m-1);
        node.right=add(m+1, en);
        return node;
    }
    void ele(TreeNode root){
        if(root==null) return;
        ele(root.left);
        l.add(root);
        ele(root.right);
    } 
}