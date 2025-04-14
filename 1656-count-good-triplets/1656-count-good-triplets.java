class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    int x=Math.abs(arr[i]-arr[j]), y=Math.abs(arr[j]-arr[k]), z=Math.abs(arr[i]-arr[k]);
                    if(x<=a && y<=b && z<=c) cnt++;
                }
            }
        }
        return cnt;
    }
}