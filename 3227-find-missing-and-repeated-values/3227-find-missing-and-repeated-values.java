class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=1;i<=grid.length*grid[0].length;i++){
            map.put(i, 0);
        }
        int res[]= new int[2];
        for(int i[]:grid){
            for(int j:i){
                map.put(j, map.get(j)+1);
            }
        }
        for(Map.Entry<Integer, Integer> m:map.entrySet()){
            if(m.getValue()==2) res[0]=m.getKey();
            if(m.getValue()==0) res[1]=m.getKey();
        }
        return res;
    }
}