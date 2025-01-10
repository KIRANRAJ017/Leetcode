class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList<>();
        int cnt[]=new int[26], maxCnt[]=new int[26];
        for(String i:words2){
            cnt=count(i);
            for(int j=0;j<26;j++){
                maxCnt[j]=Math.max(maxCnt[j], cnt[j]);
            }
        }
        for(String i:words1){
            cnt=count(i);
            boolean f=true;
            for(int j=0;j<26;j++){
                if(cnt[j]<maxCnt[j]){
                    f=false;
                    break;
                }
            }
            if(f) res.add(i);
        }
        return res;
    }
    static int[] count(String s){
        int arr[] = new int[26];
        for(char i:s.toCharArray()){
            arr[i-'a']++;
        }
        return arr;
    }
}