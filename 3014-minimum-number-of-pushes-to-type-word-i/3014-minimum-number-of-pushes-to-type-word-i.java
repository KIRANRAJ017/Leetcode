class Solution {
    public int minimumPushes(String word) {
        int cnt=0,inc=1;
        for(int i=0;i<word.length();i++){
            if(i>0 && i%8==0){
                inc++;
            }
            cnt+=inc;
        }
        return cnt;
    }
}