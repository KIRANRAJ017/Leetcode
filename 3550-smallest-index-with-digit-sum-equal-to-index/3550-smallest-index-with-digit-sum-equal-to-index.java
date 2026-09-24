class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(match(nums[i], i)) return i;
        }
        return -1;
    }
    static boolean match(int n, int i){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum==i;
    }
}