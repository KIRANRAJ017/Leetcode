class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k) return false;
        if(s.length()==k) return true;
        Map<Character, Integer> map = new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int odd=0;
        for(Map.Entry<Character, Integer> m:map.entrySet()){
            if(m.getValue()%2!=0){
                odd++;
            }
        }
        return odd<=k;
    }
}