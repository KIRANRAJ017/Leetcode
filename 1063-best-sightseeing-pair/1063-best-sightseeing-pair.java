class Solution {
    public int maxScoreSightseeingPair(int[] val) {
        int max1=0, max2=0, n=val.length;
        for(int i=0;i<n;i++){
            max2=Math.max(max2, max1+val[i]-i);
            max1=Math.max(max1, val[i]+i);
        }
        return max2;
    }
}