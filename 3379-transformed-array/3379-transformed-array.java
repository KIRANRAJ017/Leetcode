class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int a[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                int idx=i;
                for(int j=0;j<nums[i];j++){
                    idx++;
                    if(idx==nums.length) idx=0;
                }
                a[i]=nums[idx];
                nums[idx]=a[i];
            }
            else if(nums[i]<0){
                int idx=i;
                for(int j=0;j<Math.abs(nums[i]);j++){
                    idx--;
                    if(idx==-1) idx=nums.length-1;
                }
                a[i]=nums[idx];
                nums[idx]=a[i];
            }
            else{
                a[i]=nums[i];
            }
        }
        return a;
    }
}