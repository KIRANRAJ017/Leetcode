class Solution {
    public int numSplits(String s) {
        Set<Character> set = new HashSet<>();
        int n=s.length(), l[]=new int[n], r[]=new int[n];
        for(int i=0;i<n;i++){
            set.add(s.charAt(i));
            l[i]=set.size();
        }
        set.clear();
        for(int i=n-1;i>=0;i--){
            set.add(s.charAt(i));
            r[i]=set.size();
        }
        int cnt=0;
        for(int i=1;i<n;i++){
            if(l[i-1]==r[i]) cnt++;
        }
        return cnt;
    }
}