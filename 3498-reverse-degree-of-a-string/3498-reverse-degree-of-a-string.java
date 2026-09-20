class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        Map<Character, Integer> map = new HashMap<>();
        char ch='z';
        for(int i=1;i<27;i++){
            map.put(ch, i);
            ch--;
        }
        // System.out.print(map);
        int cnt=1;
        for(char i:s.toCharArray()){
            sum+=(map.get(i)*cnt);
            cnt++;
        }
        return sum;
    }
}