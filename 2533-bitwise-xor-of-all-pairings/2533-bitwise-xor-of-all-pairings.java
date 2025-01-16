class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int a=0, b=0;
        for(int i:nums1) a^=i;
        for(int i:nums2) b^=i;
        int x=nums1.length, y=nums2.length;
        if(x%2==0 && y%2==0) return 0;
        if(x%2==0 && y%2!=0) return a;
        if(x%2!=0 && y%2==0) return b;
        return a^b;
    }
}