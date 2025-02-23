class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        for(int i=0;i<grid.length;i++){
            Arrays.sort(grid[i]);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->b-a);
        for(int i=0;i<grid.length;i++){
            int c=grid[i].length;
            for(int j=c-1;j>=c-limits[i];j--){
                pq.add(grid[i][j]);
            }
        }
        long res=0;
        for(int i:pq) System.out.print(i+" ");
        while(k-->0) res+=pq.remove();
        return res;
    }
}