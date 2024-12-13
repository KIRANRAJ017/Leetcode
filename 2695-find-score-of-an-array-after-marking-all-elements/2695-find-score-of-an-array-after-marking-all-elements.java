class Solution {
    static class Data{
        int val, idx, left, right;
        Data(int val, int idx, int left, int right){
            this.val=val;
            this.idx=idx;
            this.left=left;
            this.right=right;
        }
    }
    public long findScore(int[] nums) {
        Set<Data> set = new TreeSet<>((a, b)->{
            if(a.val==b.val) return Integer.compare(a.idx, b.idx);
            return Integer.compare(a.val, b.val);
        });
        Set<Integer> index = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int left=i==0?-1:i-1, right=i==nums.length-1?-1:i+1;
            set.add(new Data(nums[i], i, left, right));
        }
        long res=0;
        for(Data i:set){
            if(index.contains(i.idx)) continue;
            res+=i.val;
            index.add(i.idx);
            index.add(i.left);
            index.add(i.right);
        }
        return res;
    }
}