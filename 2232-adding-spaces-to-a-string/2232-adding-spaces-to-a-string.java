class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);
        int idx=0;
        for(int i:spaces){
            sb.insert(i+idx, ' ');
            idx++;
        }
        return sb.toString();
    }
}