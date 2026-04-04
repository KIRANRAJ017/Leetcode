class Solution {
    public String decodeCiphertext(String str, int rows) {
        int cols=str.length()/rows;
        char ch[][]=new char[rows][cols];
        int idx=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                ch[i][j]=str.charAt(idx);
                idx++;
            }
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<cols;i++){
            int x=0, y=i;
            StringBuilder temp=new StringBuilder();
            while(x<rows && y<cols){
                res.append(ch[x][y]);
                x++;
                y++;
            }
        }
        return removeSpace(res.toString());
    }
    static String removeSpace(String s){
        int cnt=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ') cnt++;
            else break;
        }
        return s.substring(0, s.length()-cnt);
    }
}