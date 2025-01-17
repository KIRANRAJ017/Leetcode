class Solution {
    public boolean doesValidArrayExist(int[] d) {
        int n=d.length, a[]=new int[n+1], b[]=new int[n+1];
        a[0]=0; b[0]=1;
        for(int i=0;i<n;i++){
            if(d[i]==0){
                a[i+1]=a[i]; b[i+1]=b[i];
            }
            else{
                a[i+1]=a[i]==0?1:0;
                b[i+1]=b[i]==0?1:0;
            }
        }
        return a[0]==a[n] && b[0]==b[n];
    }
}