class Solution {
    public String smallestPalindrome(String s) {
        Map<Character, Integer> map = new TreeMap<>();
        for(char i:s.toCharArray()){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        StringBuilder res = new StringBuilder();
        char odd=' ';
        for(Map.Entry<Character, Integer> m:map.entrySet()){
            int val=m.getValue();
            if(val%2!=0) odd=m.getKey();
            for(int i=0;i<m.getValue()/2;i++){
                res.append(m.getKey());
            }
        }
        String last=res.reverse().toString();
        res=res.reverse();
        if(odd!=' ') res.append(odd);
        return res.toString()+last;
    }
}