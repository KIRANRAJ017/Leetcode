class Solution {
    public int maximumCount(int[] nums) {
        int neg=0,ze=0;
        for(int i:nums)
        {
            if(i<0)
            {
                neg++;
            }
            else if(i==0)
            {
                ze++;
            }
            else
            {
                break;
            }
        }
        if(neg>nums.length-neg-ze)
        {
            return neg;
        }
        return nums.length-neg-ze;
    }
}