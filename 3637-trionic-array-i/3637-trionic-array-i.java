class Solution {
    public boolean isTrionic(int[] nums) {
        int idx=1;
        while(idx<nums.length && nums[idx-1]<nums[idx]){
            idx++;
        }
        int a=idx-1;
        while(idx<nums.length && nums[idx-1]>nums[idx]){
            idx++;
        }
        int b=idx-1;
        while(idx<nums.length && nums[idx-1]<nums[idx]){
            idx++;
        }
        int c=idx-1;
        return (a!=0) && (b!=a) && ( c==nums.length-1 && c!=b );
    }
}