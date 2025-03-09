class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n=colors.length, group=0, cnt=0, a=0;
        for(int i=1;i<n+k-2;i++){
            if(colors[i%n]!=colors[(i+1)%n] && colors[i%n]!=colors[(i-1)%n]){
                cnt++;
            }
            else{
                int val=(cnt+2);
                a=val-k;
                group+=a>=0?a+1:0;
                cnt=0;
            }
        }
        if(cnt>0){
            int val=(cnt+2);
            a=val-k;
            group+=a>=0?a+1:0;
        }
        return group;
    }
}