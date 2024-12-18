class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length, res[]=new int[n];
        for(int i=0;i<n;i++){
            boolean found=false;
            for(int j=i+1;j<n;j++){
                if(prices[j]<=prices[i]){
                    res[i]=prices[i]-prices[j];
                    found=true;
                    break;
                }
            }
            if(!found) res[i]=prices[i];
        }
        return res;
    }
}