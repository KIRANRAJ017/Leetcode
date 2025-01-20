class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n=mat.length, m=mat[0].length;
        int row[]=new int[n], col[]=new int[m];
        Map<Integer, int[]> map = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                map.put(mat[i][j], new int[]{i, j});
            }
        }
        for(int i=0;i<arr.length;i++){
            int r=map.get(arr[i])[0], c=map.get(arr[i])[1];
            row[r]++;
            col[c]++;
            if(row[r]==m || col[c]==n){
                return i;
            }
        }
        return n*m-1;
    }
}