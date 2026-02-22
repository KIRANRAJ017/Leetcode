class Solution {
    public int scoreDifference(int[] nums) {
        int a=1, b=0, aScore=0, bScore=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                a=a==1?0:1;
                b=b==1?0:1;
            }
            if((i+1)%6==0){
                a=a==1?0:1;
                b=b==1?0:1;
            }
            if(a==1) aScore+=nums[i];
            else bScore+=nums[i];
        }
        return aScore-bScore;
    }
}