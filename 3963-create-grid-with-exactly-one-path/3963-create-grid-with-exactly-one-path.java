class Solution {
    public String[] createGrid(int m, int n) {
        String res[]=new String[m];
        StringBuilder a=new StringBuilder(), b=new StringBuilder();
        for(int i=0;i<n;i++) a.append('.');
        for(int i=0;i<n-1;i++) b.append('#');
        b.append('.');
        for(int i=0;i<m;i++){
            if(i==0) res[i]=a.toString();
            else res[i]=b.toString();
        }
        return res;
    }
}