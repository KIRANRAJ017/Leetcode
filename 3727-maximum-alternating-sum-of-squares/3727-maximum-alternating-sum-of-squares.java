class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) nums[i]*=(-1);
        }
        Arrays.sort(nums);
        long res=0;
        for(int i=0;i<nums.length/2;i++){
            res+=(nums[nums.length-i-1]*nums[nums.length-i-1]);
            res-=(nums[i]*nums[i]);
        }
        if(nums.length%2!=0) res+=(nums[nums.length/2]*nums[nums.length/2]);
        return res;
    }
}