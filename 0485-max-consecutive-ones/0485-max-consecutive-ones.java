class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0, cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) cnt++;
            else{
                max=Math.max(max, cnt);
                cnt=0;
            }
        }
        max=Math.max(max, cnt);
        return max;
    }
}