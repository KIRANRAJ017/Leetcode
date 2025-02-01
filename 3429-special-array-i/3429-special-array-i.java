class Solution {
    public boolean isArraySpecial(int[] nums) {
        int r=nums[0]%2;
        for(int i=0;i<nums.length;i++){
            if((i%2==0 && nums[i]%2!=r) ||(i%2!=0 && nums[i]%2==r)){
                return false;
            }
        }
        return true;
    }
}