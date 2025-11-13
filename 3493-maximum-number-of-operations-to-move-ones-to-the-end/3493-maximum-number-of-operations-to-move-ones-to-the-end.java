class Solution {
    public int maxOperations(String s) {
        int oneCnt=0, tot=0, f=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                if(f==1){
                    tot+=oneCnt;
                    f=0;
                }
                oneCnt++;
            }
            else{
                f=1;
            }
        }
        if(f==1){
            tot+=oneCnt;
        }
        return tot;
    }
}