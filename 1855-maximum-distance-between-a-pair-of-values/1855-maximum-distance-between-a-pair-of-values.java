class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max=0;
        for(int i=0;i<nums1.length;i++){
            int st=i, en=nums2.length-1;
            while(st<=en){
                int m=(st+en)/2;
                if(nums2[m]>=nums1[i]){
                    max=Math.max(max, m-i);
                    st=m+1;
                }else{
                    en=m-1;
                }
            }
        }
        return max;
    }
}