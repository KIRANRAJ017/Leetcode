class Solution {
    public int maxScore(String s) {
        int oCnt=0,zCnt=0;
        if(s.charAt(0)=='0') zCnt++;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='1'){
                oCnt++;
            }  
        }
        int max=0;
        for(int i=1;i<s.length();i++){
            max=Math.max(max,oCnt+zCnt);
            if(s.charAt(i)=='1'){oCnt--;}
            else{zCnt++;}
        }
        return max;
    }
}