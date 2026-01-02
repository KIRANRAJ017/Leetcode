class Solution {
    public int repeatedNTimes(int[] nums) {
        boolean arr[]=new boolean[10000];
        for(int i:nums){
            if(arr[i]) return i;
            arr[i]=true;
        }
        return nums[0];
    }
}