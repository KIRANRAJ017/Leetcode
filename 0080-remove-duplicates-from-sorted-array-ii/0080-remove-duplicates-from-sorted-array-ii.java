class Solution {
    public int removeDuplicates(int[] nums) {
        int ind=0;
        for(int i:nums)
        {
            if(ind<2 || i>nums[ind-2])
                nums[ind++]=i;
        }
        return ind;
    }
}