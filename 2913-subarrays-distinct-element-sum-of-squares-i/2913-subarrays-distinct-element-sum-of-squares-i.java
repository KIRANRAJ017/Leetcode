class Solution {
    public int sumCounts(List<Integer> n) {
        int sum=0;
        for(int i=0;i<n.size();i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i;j<n.size();j++){
                set.add(n.get(j));
                sum+=(int)Math.pow(set.size(),2);
            }
        }
        return sum;
    }
}