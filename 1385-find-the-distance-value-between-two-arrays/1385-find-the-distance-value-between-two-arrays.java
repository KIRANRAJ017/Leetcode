class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt=0;
        for(int i:arr1){
            boolean f=false;
            for(int j:arr2){
                if(Math.abs(i-j)<=d){
                    f=true;
                    break;
                }
            }
            if(f) continue;
            cnt++;
        }
        return cnt;
    }
}