class Solution {
    public int numberOfSpecialChars(String word) {
        int cnt=0;
        Map<Character,Integer> map = new HashMap<>();
        for(char i:word.toCharArray()){
            map.put(i,1);
        }
        for(char i:word.toCharArray()){
            char ch = Character.toLowerCase(i);
            if(i>='A' && i<='Z' && map.containsKey(ch) && map.get(ch)>0){
                cnt++;
                map.put(ch,0);
            }
        }
        return cnt;
    }
}