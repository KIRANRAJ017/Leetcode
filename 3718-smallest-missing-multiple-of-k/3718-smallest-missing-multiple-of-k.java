class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums) set.add(i);
        int i=1;
        while(set.contains(k*i)){
            i++;
        }
        return i*k;
    }
}