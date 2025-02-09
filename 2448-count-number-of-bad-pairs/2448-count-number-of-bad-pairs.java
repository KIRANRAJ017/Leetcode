class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        long cnt=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int val=nums[i]-i;
            cnt+=map.getOrDefault(val, 0);
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        return 1L*n*(n-1)/2-cnt;
    }
}