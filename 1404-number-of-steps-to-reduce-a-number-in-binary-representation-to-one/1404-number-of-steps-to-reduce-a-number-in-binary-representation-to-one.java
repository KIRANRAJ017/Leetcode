class Solution {
    public int numSteps(String s) {
        int res=0, car=0;
        for(int i=s.length()-1;i>0;i--){
            res++;
            if(s.charAt(i)-'0'+car==1){
                res++;
                car=1;
            }
        }
        return res+car;
    }
}