class Solution {
    public boolean hasAllCodes(String s, int k) {
        int val=(int)Math.pow(2, k), n=s.length();
        Set<Integer> set = new HashSet<>();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<n;i++){
            res.append(s.charAt(i));
            if(i>=k-1){
                int num=Integer.parseInt(res.toString(), 2);
                set.add(num);
                res.deleteCharAt(0);
            }
        }
        return set.size()==val;
    }
}