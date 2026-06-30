class Solution {
    public int numberOfSubstrings(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 0); map.put('b', 0); map.put('c', 0);
        int res=0, idx=0;
        for(char i:s.toCharArray()){
            map.put(i, map.get(i)+1);
            while(map.get('a')>0 && map.get('b')>0 && map.get('c')>0){
                map.put(s.charAt(idx), map.get(s.charAt(idx))-1);
                idx++;
            }
            res+=idx;
        }
        return res;
    }
}