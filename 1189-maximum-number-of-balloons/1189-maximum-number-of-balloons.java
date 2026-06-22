class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('b', 0); map.put('a', 0); map.put('l', 0); map.put('o', 0); map.put('n', 0);
        int min=Integer.MAX_VALUE;
        for(char i:text.toCharArray()){
            if(i=='b' || i=='a'||i=='l'||i=='o'||i=='n') map.put(i, map.get(i)+1);
        } 
        min=Math.min(min, map.get('b'));
        min=Math.min(min, map.get('a'));
        min=Math.min(min, map.get('l')/2);
        min=Math.min(min, map.get('o')/2);
        min=Math.min(min, map.get('n'));
        return min;
    }
}