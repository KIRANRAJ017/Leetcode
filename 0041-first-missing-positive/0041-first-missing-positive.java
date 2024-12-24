class Solution {
    public int firstMissingPositive(int[] nums) {
        int max=0;
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                map.put(nums[i], 1);
            }
        }
        int idx=1;
        for(Map.Entry<Integer, Integer> m:map.entrySet()){
            if(m.getKey()!=idx){
                return idx;
            }
            idx++;
        }
        System.out.print(map);
        return idx;
    }
}