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
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int cnt=0;
        while(!q.isEmpty()){
            int s=q.size();
            int a[]=new int[s*2], idx=0;
            while(s-->0){
                root=q.poll();
                if(root.left!=null){
                    a[idx++]=root.left.val;
                    q.add(root.left);
                }
                if(root.right!=null){
                    a[idx++]=root.right.val;
                    q.add(root.right);
                }
            }
            int temp[]=Arrays.copyOfRange(a, 0, idx);
            Arrays.sort(temp);
            Map<Integer, Integer> map = new HashMap<>();
            for(int i=0;i<idx;i++) map.put(a[i], i);
            for(int i=0;i<idx;i++){
                if(a[i]!=temp[i]){
                    cnt++;
                    int t=a[i], dest=map.get(temp[i]);
                    swap(a, i, map.get(temp[i]));
                    map.put(temp[i], i);
                    map.put(t, dest);
                }
            }
        }
        return cnt;
    }
    static void swap(int a[], int i, int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}