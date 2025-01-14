class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int res[] = new int[A.length], prefix=0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++){
            map.put(A[i], map.getOrDefault(A[i], 0)+1);
            map.put(B[i], map.getOrDefault(B[i], 0)+1);
            int cnt=0;
            for(Map.Entry<Integer, Integer> m :map.entrySet()){
                if(m.getValue()%2==0) cnt++;
            }
            res[i]=cnt;
        }
        return res;
    }
}