class Solution {
    public int sumFourDivisors(int[] nums) {
        int maxDiv=0;
        for(int i:nums){
            maxDiv+=getDivSum(i);
        }
        return maxDiv;
    }
    static int getDivSum(int n){
        int cnt=2, sum=n+1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
                cnt++;
            }
            if(cnt>4) return 0;
        }
        // System.out.print(sum+" ");
        return cnt==4?sum:0;
    }
}