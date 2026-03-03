class Solution {
    StringBuilder sb;
    public char findKthBit(int n, int k) {
        sb = new StringBuilder("0");
        while(sb.length()<k){
            add(sb);
        }
        return sb.charAt(k-1);
    }
    static void add(StringBuilder sb){
        StringBuilder rev=new StringBuilder();
        for(int i=sb.length()-1;i>=0;i--){
            rev.append(sb.charAt(i)=='0'?'1':'0');
        }
        sb.append("1"); sb.append(rev);
    }
}