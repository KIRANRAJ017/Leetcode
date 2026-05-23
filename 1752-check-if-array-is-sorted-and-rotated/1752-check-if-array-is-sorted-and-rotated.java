class Solution {
    public boolean check(int[] nums) {
        for(int i=0;i<nums.length;i++){
            boolean f=true;
            for(int j=i;j<nums.length+i-1;j++){
                if(nums[j%nums.length]>nums[(j+1)%nums.length]){
                    f=false;
                    break;
                }
            }
            if(f) return true;
        }
        return false;
    }
}