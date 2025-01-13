class Solution {
    public int minimumLength(String s) {
        Map<Character, List<Integer>> map = new HashMap<>();
        int arr[] = new int[256];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            arr[c]++;
            if(arr[c]==3){
                map.get(c).remove(0);
                arr[c]=1;
            }
            else{
                if(!map.containsKey(c)){
                    List<Integer> l = new ArrayList<>();
                    l.add(i);
                    map.put(c, l);
                }
                else{
                    map.get(c).add(i);
                }
            }
        }
        int cnt=0;
        for(Map.Entry<Character, List<Integer>> m:map.entrySet()){
            cnt+=m.getValue().size();
        }
        return cnt;
    }
}