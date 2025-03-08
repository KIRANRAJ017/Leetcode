class Solution {
    public int minimumRecolors(String s, int k) {
        int w=0, b=0;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='W') w++;
            else b++;
        }
        int min=w;
        for(int i=k;i<s.length();i++){
            if(s.charAt(i-k)=='W') w--;
            else b--;
            if(s.charAt(i)=='W') w++;
            else b++;
            min=Math.min(min, k-b);
        }
        return min;
    }
}