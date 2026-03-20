class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[]=new int[2*n];
        int x=0, y=n, i=0;
        while(i<2*n){
            res[i++]=nums[x];
            res[i++]=nums[y];
            x++;
            y++;
        }
        return res;
    }
}