class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        long ans=0;
        for(int i=0;i<bottomLeft.length;i++){
            for(int j=i+1;j<bottomLeft.length;j++){
                int a=Math.max(bottomLeft[i][0],bottomLeft[j][0]);
                int b=Math.min(topRight[i][0],topRight[j][0]);
                int c=Math.max(bottomLeft[i][1],bottomLeft[j][1]);
                int d=Math.min(topRight[i][1],topRight[j][1]);
                
                if(a<b && c<d){
                    int s=Math.min(b-a,d-c);
                    ans=Math.max(ans,(long)s*s);
                }
            }
        }
        return ans;
    }
}