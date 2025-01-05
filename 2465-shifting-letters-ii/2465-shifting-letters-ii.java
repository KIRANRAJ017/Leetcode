class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n=s.length(), arr[]=new int[n+1];
        for(int i[]:shifts){
            if(i[2]==0){
                arr[i[0]]-=1;
                arr[i[1]+1]+=1;
            }
            else{
                arr[i[0]]+=1;
                arr[i[1]+1]-=1;
            }
        }
        int currSum=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            currSum+=arr[i];
            sb.append((char)((s.charAt(i)-'a'+(currSum%26+26)%26)%26+'a'));
        }
        return sb.toString();
    }
}