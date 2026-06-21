class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int totIce=0;
        for(int i:costs){
            coins-=i;
            if(coins<0){
                return totIce;
            }
            totIce++;
        }
        return totIce;
    }
}