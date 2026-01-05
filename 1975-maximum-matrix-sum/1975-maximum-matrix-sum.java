class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0, cnt=0, min=Long.MAX_VALUE;
        for(int i[]:matrix){
            for(int j:i){
                sum+=Math.abs(j);
                if(j<0) cnt++;
                min=Math.min(min, Math.abs(j));
            }
        }
        if(cnt%2!=0) sum-=2*min;
        return sum;
    }
}