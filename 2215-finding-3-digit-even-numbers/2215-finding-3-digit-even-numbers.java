class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> set =new TreeSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    int val=digits[i]*100+digits[j]*10+digits[k];
                    if(val%2==0 && val>=100 && val<=999 && i!=j && i!=k && j!=k) set.add(val);
                }
            }
        }
        int idx=0, res[]=new int[set.size()];
        for(int i:set){
            res[idx++]=i;
        }
        return res;
    }
}