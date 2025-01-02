class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int arr[]=new int[words.length];
        int sum=0;
        for(int i=0;i<words.length;i++){
            if(set.contains(words[i].charAt(0)) && set.contains(words[i].charAt(words[i].length()-1))){
                sum++;
            }
            arr[i]=sum;
        }
        int idx=0, res[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            res[i]=arr[queries[i][1]]-(queries[i][0]==0?0:arr[queries[i][0]-1]);
        }
        return res;
    }
}