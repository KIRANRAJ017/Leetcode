class Solution {
    public int[] minOperations(String box) {
        int n=box.length(), res[]=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                if(box.charAt(j)=='1') sum+=Math.abs(i-j);
            }
            res[i]=sum;
        }
        return res;
    }
}