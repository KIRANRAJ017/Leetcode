class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int ptr1=0,ptr2=0;
        while(ptr1<nums1.length && ptr2<nums2.length){
            if(nums1[ptr1]==nums2[ptr2]){
                return nums1[ptr1];
            }
            else if(nums1[ptr1]<nums2[ptr2]){
                ptr1++;
            }
            else{
                ptr2++;
            }
        }
        return -1;
    }
}