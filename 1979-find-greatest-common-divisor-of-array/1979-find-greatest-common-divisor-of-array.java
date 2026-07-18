class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE, max=0;
        for(int i:nums){
            min=Math.min(min, i);
            max=Math.max(max, i);
        } 
        return gcd(min, max);
    }
    static int gcd(int a, int b){
        for(int i=a;i>=1;i--){
            if(a%i==0 && b%i==0) return i;
        }
        return 1;
    }
}