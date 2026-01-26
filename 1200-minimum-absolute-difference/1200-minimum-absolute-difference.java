class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        Map<Integer, List<List<Integer>>> map = new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int abs=Math.abs(arr[i]-arr[i+1]);
            min=Math.min(min, abs);
            List<Integer> l = new ArrayList<>();
            l.add(arr[i]); l.add(arr[i+1]);
            if(!map.containsKey(abs)){
                List<List<Integer>> lst = new ArrayList<>();
                lst.add(l);
                map.put(abs, lst);
            }
            else{
                map.get(abs).add(l);
            }
        }
        return map.get(min);
    }
}