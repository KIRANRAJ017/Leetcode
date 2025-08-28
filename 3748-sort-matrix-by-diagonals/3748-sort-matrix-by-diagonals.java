class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        for(int i=0;i<n;i++){
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->b-a);
            int row=i, col=0;
            while(row<n && col<n){
                pq.add(grid[row][col]);
                row++; col++;
            }
            row=i; col=0;
            while(row<n && col<n){
                grid[row][col]=pq.poll();
                row++;
                col++;
            }
        }
        for(int i=0;i<n-1;i++){
            int row=0, col=i+1;
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            while(row<n && col<n){
                pq.add(grid[row][col]);
                row++; col++;
            }
            row=0; col=i+1;
            while(row<n && col<n){
                grid[row][col]=pq.poll();
                row++; col++;
            }
        }
        return grid;
    }
}