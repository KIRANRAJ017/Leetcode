class Solution {
    static class Data{
        int val, idx;
        Data(int val, int idx){
            this.val=val;
            this.idx=idx;
        }
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Data> pq = new PriorityQueue<>((a, b)->{
            if(a.val==b.val){
                return Integer.compare(a.idx, b.idx);
            }
            return Integer.compare(a.val, b.val);
        });
        for(int i=0;i<nums.length;i++){
            pq.add(new Data(nums[i], i));
        }
        while(k-->0){
            Data d = pq.poll();
            d.val*=multiplier;
            pq.add(d);
        }
        for(Data i:pq){
            nums[i.idx]=i.val;
        }
        return nums;
    }
}