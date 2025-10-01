class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drunk=numBottles, rem=0;
        while(numBottles>=numExchange){
            rem=numBottles%numExchange;
            numBottles/=numExchange;
            drunk+=numBottles;
            numBottles+=rem;
        }
        return drunk;
    }
}