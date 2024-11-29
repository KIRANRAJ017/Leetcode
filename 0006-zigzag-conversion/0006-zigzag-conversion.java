class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        int inc=2*(numRows-1);
        String s1="";
        for(int i=0;i<numRows;i++){
            int idx=i,cnt=0;
            if(inc==0){
                inc=2*(numRows-1);
            }
            while(idx<s.length()){
                if(cnt%2==0){
                    s1+=s.charAt(idx);
                    idx+=inc;
                }else{
                    s1+=s.charAt(idx);
                    idx+=2*i;
                }
                cnt+=inc==2*(numRows-1)?0:1;
                //System.out.print(cnt);
            }
            //System.out.print(s1+" ");
            inc-=2;
        }
        return s1;
    }
}