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
    public TreeNode createBinaryTree(int[][] desc) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int i[]:desc){
            if(!map.containsKey(i[0])){
                TreeNode node = new TreeNode(i[0]);
                map.put(i[0], node);
            }
            if(i[2]==1){
                TreeNode left = left = new TreeNode(i[1]);
                map.get(i[0]).left=left;
            }
            else if(i[2]==0){
                TreeNode right = right = new TreeNode(i[1]);
                map.get(i[0]).right=right;
            }
            set.add(i[1]);
        }
        for(int i[]:desc){
            if(map.containsKey(i[1])){
                if(i[2]==1){
                    map.get(i[0]).left=map.get(i[1]);
                }
                else{
                    map.get(i[0]).right=map.get(i[1]);
                }
            }
        }
        int res=-1;
        for(int i[]:desc){
            if(!set.contains(i[0])){
                res=i[0];
                break;
            }
        }
        return map.getOrDefault(res, null);
    }
}