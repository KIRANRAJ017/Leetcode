class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int cnt=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                int a=words[i].length(),b=words[j].length();
                if(a<=b && words[i].equals(words[j].substring(0,a)) && words[i].equals(words[j].substring(b-a))){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}