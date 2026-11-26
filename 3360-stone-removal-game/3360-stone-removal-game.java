class Solution {
    public boolean canAliceWin(int n) {
        boolean f=true;
        int val=10;
        while(n>=val){
            n-=val;
            val--;
            f=!f;
        }
        return !f;
    }
}