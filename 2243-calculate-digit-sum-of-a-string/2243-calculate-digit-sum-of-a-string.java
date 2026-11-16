class Solution {
    static String str;
    public String digitSum(String s, int k) {
        str=new String(s);
        while(str.length()>k){
            round(str, k);
            // System.out.print(str);
            // break;
        }
        return str;
    }
    static void round(String s, int k){
        StringBuilder sb = new StringBuilder();
        int sum=0, l=s.length()-(s.length()%k);
        for(int i=0;i<l;i+=k){
            sum=0;
            for(int j=i;j<i+k;j++){
                sum+=s.charAt(j)-'0';
            }
            sb.append(sum);
        }
        sum=0;
        for(int i=l;i<s.length();i++){
            sum+=s.charAt(i)-'0';
        }
        if(l!=s.length()) sb.append(sum);
        str=sb.toString();
    }
}