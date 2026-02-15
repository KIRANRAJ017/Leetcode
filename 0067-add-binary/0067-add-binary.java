class Solution {
    public String addBinary(String a, String b) {
        while(a.length()<b.length()){
            a="0"+a;
        }
        while(b.length()<a.length()){
            b="0"+b;
        }
        System.out.print(a+"\n"+b);
        String s="";
        int carry=0;
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i)-'0'+b.charAt(i)-'0'+carry==2){
                s+='0';
                carry=1;
            }
            else if(a.charAt(i)-'0'+b.charAt(i)-'0'+carry==3){
                s+='1';
                carry=1;
            }
            else if(a.charAt(i)-'0'+b.charAt(i)-'0'+carry==0){
                s+='0';
                carry=0;
            }
            else{
                s+='1';
                carry=0;
            }
        }
        if(carry==1){
            s+='1';
        }
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString(); 
    }
}