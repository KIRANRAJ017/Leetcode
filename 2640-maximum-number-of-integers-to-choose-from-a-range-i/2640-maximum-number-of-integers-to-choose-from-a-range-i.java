class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set = new HashSet<>();
        for(int i:banned) set.add(i);
        int cnt=0, sum=0;
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                sum+=i;
                if(sum>maxSum) return cnt;
                else if(sum==maxSum) return cnt+1;
                cnt++;
            }
        }
        return cnt;
    }
}