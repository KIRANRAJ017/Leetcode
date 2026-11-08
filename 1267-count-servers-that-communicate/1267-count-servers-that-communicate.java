class Solution {
    public int countServers(int[][] grid) {
        int n=grid.length, m=grid[0].length, ser=0;
        List<int[]> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    l.add(new int[]{i, j});
                    ser++;
                }
            }
        }
        int cnt=0;
        for(int i[]:l){
            int x=i[0], y=i[1], count=0;
            for(int j=0;j<m;j++){
                if(grid[x][j]==1) count++;
            }
            for(int j=0;j<n;j++){
                if(grid[j][y]==1) count++;
            }
            if(count==2) cnt++;
        }
        return ser-cnt;
    }
}