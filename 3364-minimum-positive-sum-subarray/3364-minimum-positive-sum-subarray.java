class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min=Integer.MAX_VALUE;
        for(int i=l;i<=r;i++){
            for(int j=0;j<=nums.size()-i;j++){
                int sum=0;
                for(int k=j;k<j+i;k++) sum+=nums.get(k);
                if (sum>0) min=Math.min(min, sum);
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}