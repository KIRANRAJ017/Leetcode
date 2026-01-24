class Solution {
    public int vowelConsonantScore(String s) {
        int v=0, c=0;
        for(char i:s.toCharArray()){
            if(i>='a' && i<='z'){
                if(vow(i)) v++;
                else c++;
            }
        }
        return c>0?(int)(Math.floor(v/c)):0;
    }
    static boolean vow(char c){
        c=Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return true;
        return false;
    }
}