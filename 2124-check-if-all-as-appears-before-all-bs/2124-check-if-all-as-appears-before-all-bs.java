class Solution {
    public boolean checkString(String s) {
        boolean a=false, b=false;
        for(char i:s.toCharArray()){
            if(i=='a') a=true;
            else b=true;
            if(i=='a' && b) return false;
            // if(i=='b' && !a) return false;
        }
        return true;
    }
}