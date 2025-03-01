class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length, res[]=new int[n];
        int idx=0;
        for(int i=0;i<n;i++){
            if(i+1<n && nums[i]==nums[i+1] && nums[i]!=0){
                res[idx++]=nums[i]*2;
                nums[i+1]=0;
            }
            else if(nums[i]!=0){
                res[idx++]=nums[i];
            }
        }
        return res;
    }
}