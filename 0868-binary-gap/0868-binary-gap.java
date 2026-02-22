class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int last=-1, max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                if(last==-1) last=i;
                else{
                    max=Math.max(max, i-last);
                    last=i;
                }
            }
        }
        return max;
    }
}