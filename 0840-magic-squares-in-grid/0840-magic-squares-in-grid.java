class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int r=grid.length, c=grid[0].length, cnt=0;
        for(int i=0;i<=r-3;i++){
            for(int j=0;j<=c-3;j++){
                if(mat(grid, i, j)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    static boolean mat(int [][] grid, int n, int m){
        Set<Integer> set = new HashSet<>();
        Set<Integer> val = new HashSet<>();
        set.add(grid[n][m]);
        set.add(grid[n][m+1]);
        set.add(grid[n][m+2]);
        set.add(grid[n+1][m]);
        set.add(grid[n+1][m+1]);
        set.add(grid[n+1][m+2]);
        set.add(grid[n+2][m]);
        set.add(grid[n+2][m+1]);
        set.add(grid[n+2][m+2]);
        int row1=grid[n][m]+grid[n][m+1]+grid[n][m+2];
        int row2=grid[n+1][m]+grid[n+1][m+1]+grid[n+1][m+2];
        int row3=grid[n+2][m]+grid[n+2][m+1]+grid[n+2][m+2];
        int col1=grid[n][m]+grid[n+1][m]+grid[n+2][m];
        int col2=grid[n][m+1]+grid[n+1][m+1]+grid[n+2][m+1];
        int col3=grid[n][m+2]+grid[n+1][m+2]+grid[n+2][m+2];
        int dig1=grid[n][m]+grid[n+1][m+1]+grid[n+2][m+2];
        int dig2=grid[n][m+2]+grid[n+1][m+1]+grid[n+2][m];
        val.add(col1);val.add(col2);val.add(col3);
        val.add(row1);val.add(row2);val.add(row3);
        val.add(dig1);val.add(dig2);
        //System.out.print(val+" "+set);
        if((row1!=row2 || row2!=row3) || (col1!=col2 || col1!=col3) || (dig1!=dig2) || set.size()!=9 || val.size()!=1 || dig1!=col1){
            return false;
        }
        if(set.contains(0) || set.contains(10)||set.contains(11)||set.contains(12)||set.contains(13)||set.contains(14)||set.contains(15)){
            return false;
        }
        return true;
    }
}