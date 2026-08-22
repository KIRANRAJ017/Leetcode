class Solution {
    public boolean checkDivisibility(int n) {
        int sum=sumOf(n);
        int pro=proOf(n);
        System.out.print(sum+" "+pro+" ");
        return n%(sum+pro)==0;
    }
    static int sumOf(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    static int proOf(int n){
        int pro=1;
        while(n>0){
            pro*=(n%10);
            n/=10;
        }
        return pro;
    }
}