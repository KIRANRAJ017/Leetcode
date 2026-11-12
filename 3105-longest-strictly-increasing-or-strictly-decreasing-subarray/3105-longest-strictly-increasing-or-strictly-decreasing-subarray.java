class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=0,dec=0,cnt=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                cnt++;
            }
            else{
                inc=Math.max(inc,cnt);
                cnt=0;
            }
        }
        inc=Math.max(inc,cnt);
        cnt=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                cnt++;
            }
            else{
                dec=Math.max(dec,cnt);
                cnt=0;
            }
        }
        dec=Math.max(dec,cnt);
        return Math.max(inc,dec)+1;
    }
}