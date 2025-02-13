public class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer((long)num);
        }

        int operations = 0;
        while (pq.size() >= 2 && pq.peek() < k) {
            long smallest = pq.poll();
            long secondSmallest = pq.poll();
            long combined = Math.min(smallest, secondSmallest) * 2 + Math.max(smallest, secondSmallest);
            pq.offer(combined);
            operations++;
        }

        return operations;
    }
}