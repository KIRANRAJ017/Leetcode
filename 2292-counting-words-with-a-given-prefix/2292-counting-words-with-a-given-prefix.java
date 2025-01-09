class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt=0;
        for(String i:words){
            if(i.startsWith(pref)) cnt++;
        }
        return cnt;
    }
}