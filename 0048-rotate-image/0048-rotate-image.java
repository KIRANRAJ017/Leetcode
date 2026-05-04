class Solution {
    public void rotate(int[][] matrix) {
        int a[][]=new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                a[j][matrix.length-i-1]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=a[i][j];
            }
        }
    }
}