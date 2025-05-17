class Solution {
    public void sortColors(int[] nums) {
        int l=0, r=nums.length-1, i=0;
        while(i<=r && l<=r){
            if(nums[i]==0){
                swap(nums, l ,i);
                l++;
                i++;
            }
            else if(nums[i]==2){
                swap(nums, r, i);
                r--;
            }
            else{
                i++;
            }
        }
    }
    static void swap(int arr[], int i, int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}