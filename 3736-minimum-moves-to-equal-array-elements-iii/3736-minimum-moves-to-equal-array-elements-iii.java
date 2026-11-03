class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        for(int i:nums) max=Math.max(max, i);
        int res=0;
        for(int i:nums) res+=(max-i);
        return res;
    }
}