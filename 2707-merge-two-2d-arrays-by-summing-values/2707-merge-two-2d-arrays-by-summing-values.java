class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> a = new HashMap<>(), b=new HashMap<>();
        Set<Integer> set = new TreeSet<>();
        for(int i[]:nums1){
            a.put(i[0], i[1]);
            set.add(i[0]);
        }
        for(int i[]:nums2){
            b.put(i[0], i[1]);
            set.add(i[0]);
        }
        int idx=0, res[][]=new int[set.size()][2];
        for(int i:set){
            int val=a.getOrDefault(i, 0)+b.getOrDefault(i, 0);
            res[idx][0]=i;
            res[idx++][1]=val;
        }
        return res;
    } 
}