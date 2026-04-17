class Solution {
    public int minMirrorPairDistance(int[] nums) {
        // Arrays.sot(nums);
        Map<Integer, Integer> map = new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int rev=reverse(nums[i]);
            if(map.containsKey(nums[i])){
                min=Math.min(min, Math.abs(i-map.get(nums[i])));
            }
            map.put(rev, i);
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
    static int reverse(int n){
        int sum=0;
        while(n>0){
            sum=(sum*10)+(n%10);
            n/=10;
        }
        return sum;
    }
}