class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int vowMax=0, conMax=0;
        for(Map.Entry<Character, Integer> m:map.entrySet()){
            if(isVow(m.getKey())) vowMax=Math.max(vowMax, m.getValue());
            else conMax=Math.max(conMax, m.getValue());
        }
        return vowMax+conMax;
    }
    static boolean isVow(char c){
        c=Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return true;
        return false;
    }
}