class Solution {
    public int titleToNumber(String s) {
        int res=0, idx=0;
        for(int i=s.length()-1;i>=0;i--){
            int val=s.charAt(i)-'A'+1;
            res+=(val*Math.pow(26, idx));
            idx++;
        }
        return res;
    }
}