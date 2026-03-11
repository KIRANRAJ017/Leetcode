class Solution {
    public int bitwiseComplement(int n) {
        String a=Integer.toBinaryString(n);
        String b="";
        for(char i:a.toCharArray()){
            if(i=='0') b+='1';
            else b+='0';
        }
        return Integer.parseInt(b, 2); 
    }
}