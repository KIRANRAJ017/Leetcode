class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int n=0;
        for(int i:nums){
            String s=Integer.toString(i);
            for(char j:s.toCharArray()){
                l.add(j-'0');
            }
        }
        int[] res = new int[l.size()];
        for(int i:l) res[n++]=i;
        return res;
    }
}