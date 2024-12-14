class Solution {
    public long continuousSubarrays(int[] nums) {
        long res=0;
        int l=0, r=0;
        PriorityQueue<Integer> max = new PriorityQueue<>((a, b)->nums[b]-nums[a]);
        PriorityQueue<Integer> min = new PriorityQueue<>((a, b)->nums[a]-nums[b]);
        while(r<nums.length){
            max.add(r);
            min.add(r);
            while(l<r && nums[max.peek()]-nums[min.peek()]>2){
                l++;
                while(!max.isEmpty() && max.peek()<l){
                    max.poll();
                }
                while(!min.isEmpty() && min.peek()<l){
                    min.poll();
                }
            }
            res+=r-l+1;
            r++;
        }
        return res;
    }
}