class Solution {
    public int countPrimeSetBits(int left, int right) {
        int cnt=0;
        for(int i=left;i<=right;i++){
            if(prime(getSetBits(i))) cnt++;
        }
        return cnt;
    }
    static boolean prime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    static int getSetBits(int n){
        int cnt=0;
        String s=Integer.toBinaryString(n);
        for(char i:s.toCharArray()) if(i=='1') cnt++;
        return cnt;
    }
}