class Solution {
    public int findLucky(int[] arr) {
        int max=-1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer, Integer> m:map.entrySet()){
            if(m.getKey()==m.getValue()) max=Math.max(max, m.getKey());
        }
        return max;
    }
}