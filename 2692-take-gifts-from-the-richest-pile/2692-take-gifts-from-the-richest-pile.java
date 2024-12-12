class Solution {
    public long pickGifts(int[] gifts, int k) {
        long res=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->b-a);
        for(int i:gifts) pq.add(i);
        for(int i=0;i<k;i++){
            int val=(int)(Math.sqrt(pq.poll()));
            pq.add(val);
        }
        for(int i:pq) res+=i;
        return res;
    }
}