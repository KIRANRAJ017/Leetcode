class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length,b[]=new int[2];
        int a[]=new int [n*n],cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[cnt++]=grid[i][j];
            }
        }
        Arrays.sort(a);
        if(a[0]!=1){
            b[1]=1;}
        for(int i=0;i<n*n-1;i++){
            if(a[i]==a[i+1]){
                b[0]=a[i];
            }
            else if(a[i]+1!=a[i+1]){
                b[1]=a[i]+1;
            }
        }
        if(a[n*n-1]!=n*n){
            b[1]=n*n;
        }
        return b;
    }
}