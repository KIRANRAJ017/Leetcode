class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(check(mat, target)) return true;
        rotate(mat);
        if(check(mat, target)) return true;
        rotate(mat);
        if(check(mat, target)) return true;
        rotate(mat);
        if(check(mat, target)) return true;
        return false;
    }
    static boolean check(int mat[][], int target[][]){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]!=target[i][j]) return false;
            }
        }
        return true;
    }
    static void rotate(int mat[][]){
        int res[][]=new int[mat.length][mat.length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                res[j][mat.length-i-1]=mat[i][j];
            }
        }
        for(int i=0;i<mat.length;i++){
            System.arraycopy(res[i], 0, mat[i], 0, mat.length);
        }
    }
}