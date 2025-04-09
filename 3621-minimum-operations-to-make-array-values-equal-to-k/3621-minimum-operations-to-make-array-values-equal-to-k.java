class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        boolean f=false;
        for(int i:nums){
            if(i<k) return -1;
            if(i==k) f=true;
            set.add(i);
        }
        return f?set.size()-1:set.size();
    }
}