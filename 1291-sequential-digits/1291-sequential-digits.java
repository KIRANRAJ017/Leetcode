class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        int l=low, h=high, minCnt=0, maxCnt=0;
        minCnt=count(l);
        maxCnt=count(h);
        List<Integer> list = new ArrayList<>();
        for(int i=minCnt;i<=maxCnt;i++){
            for(int j=1;j<=10-i;j++){
                StringBuilder s=new StringBuilder();
                for(int k=0;k<i;k++){
                    s.append(j+k);
                }
                list.add(Integer.parseInt(s.toString()));
            }
        }
        for(int i:list){
            if(i>=low && i<=high) res.add(i);
            if(i>high) break;
        }
        return res;
    }
    static int count(int n){
        int cnt=0;
        while(n>0){
            cnt++;
            n/=10;
        }
        return cnt;
    }
}