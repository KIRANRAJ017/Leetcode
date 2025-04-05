class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        backtrack(0, nums, l, new ArrayList<>());
        int sum=0;
        for(List<Integer> i:l){
            int xor=0;
            for(int j:i){
                xor^=j;
            }
            sum+=xor;
        }
        return sum;
    }
    static void backtrack(int st, int nums[], List<List<Integer>> l, List<Integer> curr){
        l.add(new ArrayList<>(curr));
        for(int i=st;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(i+1, nums, l, curr);
            curr.remove(curr.size()-1);
        }
    }
}