class Solution {
    public long countSubarrays(int[] nums, int k) {
        long subCnt=0;
        int max=0;
        for(int i:nums){
            max=Math.max(max,i);
        }
        int cnt=0,st=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                cnt++;
            }
            while(cnt>=k){
                subCnt+=nums.length-i;
                if(nums[st]==max){
                    cnt--;
                }
                st++;
            }
        }
        return subCnt;
    }
}