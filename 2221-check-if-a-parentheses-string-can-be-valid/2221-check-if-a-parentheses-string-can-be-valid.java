class Solution {
    public boolean canBeValid(String s, String l) {
        int n=s.length();
        if(n%2!=0) return false;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(' || l.charAt(i)=='0') cnt++;
            else cnt--;
            if(cnt<0) return false;
        }
        cnt=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==')' || l.charAt(i)=='0') cnt++;
            else cnt--;
            if(cnt<0) return false;
        }
        return true;
    }
}