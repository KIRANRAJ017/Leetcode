class Solution {
    public int totalMoney(int n) {
        if(n<=7){
            return n*(n+1)/2;
        }
        int k=n%7,l=n/7;
        return 28*(l)+(k*(k+1))/2 + 7*(l*(l-1))/2+k*l;
    }
}