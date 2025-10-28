class Solution {
    public int countValidSelections(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(move(nums, 1, i)) cnt++;
                if(move(nums, -1, i)) cnt++;
            }
        }
        return cnt;
    }
    static boolean move(int nums[], int dir, int idx){
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++) a[i]=nums[i];
        int curr=dir;
        while(idx>=0 && idx<a.length){
            if(a[idx]==0){
                idx+=curr;
            }
            else if(a[idx]>0){
                a[idx]--;
                curr*=(-1);
                idx+=curr;
            }
        }
        for(int i:a){
            // System.out.print(i+" ");
            if(i!=0) return false;
        }
        return true;
    }
}