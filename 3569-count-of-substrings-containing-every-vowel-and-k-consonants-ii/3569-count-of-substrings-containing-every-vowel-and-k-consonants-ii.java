class Solution {
    public long countOfSubstrings(String word, int k) {
        return check(word, k)-check(word, k+1);
    }
    static long check(String word, int k){
        Map<Character, Integer> map = new HashMap<>();
        int st=0, con=0;
        long res=0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(isVow(c)) map.put(c, map.getOrDefault(c, 0)+1);
            else con++;
            while(con>=k && map.size()==5){
                res+=word.length()-i;
                char ch=word.charAt(st);
                if(isVow(ch)){
                    map.put(ch, map.get(ch)-1);
                    if(map.get(ch)==0) map.remove(ch);
                }
                else{
                    con--;
                }
                st++;
            }
        }
        return res;
    }
    static boolean isVow(char c){
        c=Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return true;
        return false;
    }
}