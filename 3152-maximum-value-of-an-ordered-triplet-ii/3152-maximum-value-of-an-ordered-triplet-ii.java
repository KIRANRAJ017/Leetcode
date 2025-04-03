class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long max=0;
        long l[]=new long[n], r[]=new long[n];
        for(int i=0;i<n;i++){
            l[i]=max;
            max=Math.max(max, nums[i]);
        }
        max=0;
        for(int i=n-1;i>=0;i--){
            r[i]=max;
            max=Math.max(max, nums[i]);
        }
        long res=0;
        for(int i=1;i<n-1;i++){
            long val=(long)((l[i]-nums[i])*r[i]);
            if(val>res) res=val;
        }
        return res;
    }
}