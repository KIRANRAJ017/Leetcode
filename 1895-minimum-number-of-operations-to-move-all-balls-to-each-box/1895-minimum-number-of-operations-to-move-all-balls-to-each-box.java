class Solution {
    public int[] minOperations(String box) {
        int n=box.length(), res[]=new int[n];
        int sum=0, cnt=0;
        for(int i=0;i<n;i++){
            cnt+=box.charAt(i)=='1'?1:0;
            res[i]+=sum;
            sum+=cnt;
        }
        cnt=0; sum=0;
        for(int i=n-1;i>=0;i--){
            cnt+=box.charAt(i)=='1'?1:0;
            res[i]+=sum;
            sum+=cnt;
        }
        return res;
    }
}