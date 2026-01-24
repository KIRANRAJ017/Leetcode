class Solution {
    public int minPairSum(int[] nums) {
        int max=0,l=0,r=nums.length-1;
        Arrays.sort(nums);
        while(l<r){
            max=Math.max(max,nums[l]+nums[r]);
            l++;
            r--;
        }
        return max;
    }
}