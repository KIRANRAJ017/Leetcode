class Solution {
    public int[] leftRightDifference(int[] nums) {
        int l=nums.length;
        int a[]=new int[l],left=0;
        for(int i=0;i<l;i++)
        {
            left+=(i==0)?0:nums[i-1];
            int right=0;
            for(int j=i+1;j<l;j++)
            {
                right+=nums[j];
            }
            a[i]=Math.abs(left-right);
        }
        return a;
    }
}