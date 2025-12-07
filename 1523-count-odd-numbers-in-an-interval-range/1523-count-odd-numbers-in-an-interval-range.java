class Solution {
    public int countOdds(int low, int high) {
        if(odd(low) && odd(high)) return (high-low)/2+1;
        else if(!odd(low) && !odd(high)) return (high-low)/2;
        return (high-low)/2+1;
    }
    static boolean odd(int n){
        return n%2!=0;
    }
}