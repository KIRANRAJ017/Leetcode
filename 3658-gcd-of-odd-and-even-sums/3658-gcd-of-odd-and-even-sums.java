class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0, sumEven=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0) sumOdd+=i;
            else sumEven+=i;
        }
        return gcd(sumOdd, sumEven);
    }
    static int gcd(int a, int b){
        int n=Math.min(a, b);
        while(n>0){
            if(a%n==0 && b%n==0) return n;
            n--;
        }
        return 1;
    }
}