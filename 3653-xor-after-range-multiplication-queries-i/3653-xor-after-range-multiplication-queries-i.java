class Solution {
    public int xorAfterQueries(int[] nums, int[][] q) {
        int mod=1000000007;
        for(int i[]:q){
            int l=i[0], r=i[1], k=i[2], v=i[3];
            for(int j=l;j<=r;j+=k){
                nums[j]=(int)(((long)nums[j]*v)%mod);
            }
        }
        int res=0;
        for(int i:nums) res^=i;
        return res;
    }
}