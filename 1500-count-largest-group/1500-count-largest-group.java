class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int max=0;
        for(int i=1;i<=n;i++){
            int val=i, sum=0;
            while(val>0){
                sum+=val%10;
                val/=10;
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
            max=Math.max(max, map.get(sum));
        }
        int res=0;
        for(Map.Entry<Integer, Integer> m:map.entrySet()){
            if(m.getValue()==max) res++;
        }
        return res;
    }
}