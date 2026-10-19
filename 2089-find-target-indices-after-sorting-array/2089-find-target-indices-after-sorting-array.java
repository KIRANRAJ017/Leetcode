class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                list.add(i);
            }
            else if(nums[i]>target)
            {
                return list;
            }
        }
        return list;
    }
}