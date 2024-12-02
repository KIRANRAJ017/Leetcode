class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String s[]=sentence.split(" ");
        int n=searchWord.length(), idx=1;
        for(String i:s){
            if(i.length()>n && i.substring(0, n).equals(searchWord)) return idx;
            idx++;
        }
        return -1;
    }
}