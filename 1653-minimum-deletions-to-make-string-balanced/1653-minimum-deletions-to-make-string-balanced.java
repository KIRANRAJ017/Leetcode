class Solution {
    public int minimumDeletions(String s) {
        int a[] = new int[s.length()], b[] = new int[s.length()], cnt=0;
        for(int i=0;i<s.length();i++){
            b[i]=cnt;
            if(s.charAt(i)=='b'){
                cnt++;
            }
        }
        cnt=0;
        for(int i=s.length()-1;i>=0;i--){
            a[i]=cnt;
            if(s.charAt(i)=='a'){
                cnt++;
            }
        }
        int min=s.length();
        for(int i=0;i<s.length();i++){
            min=Math.min(min, a[i]+b[i]);
        }
        return min;
    }
}