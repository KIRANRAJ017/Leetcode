class Solution {
    public boolean canChange(String start, String target) {
        int i=0, j=0, n=start.length();
        if(n!=target.length()) return false;
        while(i<=n && j<=n){
            while(i<n && start.charAt(i)=='_') i++;
            while(j<n && target.charAt(j)=='_') j++;
            if(i==n || j==n) return i==n && j==n;
            if(start.charAt(i) != target.charAt(j)) return false;
            if(start.charAt(i)=='L'){
                if(i<j) return false;
            }
            else{
                if(j<i) return false;
            }
            i++;
            j++;
        }
        return true;
    }
}