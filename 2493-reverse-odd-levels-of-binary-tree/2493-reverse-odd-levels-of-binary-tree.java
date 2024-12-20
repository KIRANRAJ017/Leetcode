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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int lvl=1;
        while(!q.isEmpty()){
            int size=q.size();
            List<TreeNode> l = new ArrayList<>();
            while(size-->0){
                TreeNode node=q.poll();
                if(node.left!=null ) q.add(node.left );
                if(node.right!=null) q.add(node.right);
            }
            if(lvl%2!=0){
                int idx=0, arr[]=new int[q.size()];
                for(TreeNode i:q){
                    arr[idx++]=i.val;
                }
                for(TreeNode i:q){
                    i.val=arr[--idx];
                }
            }
            lvl++;
        }
        return root;
    }
}