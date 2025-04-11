class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt=0;
        for(int i=low;i<=high;i++){
            if(sym(i)) cnt++;
        }
        return cnt;
    }
    static boolean sym(int n){
        if(n>=100 && n<=999) return false;
        String s=Integer.toString(n);
        int sum=0, f=0;
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i)-'0';
            if(i<s.length()/2) f=sum;
        }
        return f==sum-f;
    }
}