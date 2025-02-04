class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=0, sum=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]) sum+=nums[i];
            else{
                sum+=nums[i];
                max=Math.max(max, sum);
                sum=0;
            }
        }
        sum+=nums[nums.length-1];
        return Math.max(max, sum);
    }
}