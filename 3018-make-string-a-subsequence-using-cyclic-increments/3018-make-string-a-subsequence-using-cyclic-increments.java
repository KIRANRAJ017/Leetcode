class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int idx=0, in=0;
        while(in<str2.length() && idx<str1.length()){
            char next=str1.charAt(idx)=='z'?'a':(char)(str1.charAt(idx)+1);
            if(str2.charAt(in)==str1.charAt(idx) || str2.charAt(in)==next){
                System.out.print(str2.charAt(in)+" ");
                in++;
            }
            idx++;
        }
        return in==str2.length();
    }
}