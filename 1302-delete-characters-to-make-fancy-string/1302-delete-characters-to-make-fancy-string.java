class Solution {
    public String makeFancyString(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i+2<s.length() && s.charAt(i)==s.charAt(i+1) && s.charAt(i)==s.charAt(i+2)){
                continue;
            }
            res.append(s.charAt(i));
        }
        return res.toString();
    }
}