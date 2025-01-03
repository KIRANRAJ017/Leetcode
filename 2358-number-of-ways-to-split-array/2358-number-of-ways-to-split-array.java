class Solution {
    public int waysToSplitArray(int[] nums) {
        int res=0;
        long sum=0, left=0;
        for(int i:nums) sum+=i;
        for(int i=0;i<nums.length-1;i++){
            left+=nums[i];
            sum-=nums[i];
            if(left>=sum) res++;
        }
        return res;
    }
}