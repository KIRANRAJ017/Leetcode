class Solution {
    public int maxDepth(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            int left=0,right=0;
            for(int j=0;j<i;j++){
                if(s.charAt(j)=='(') left++;
                if(s.charAt(j)==')') right++;
            }
            max=Math.max(max,left-right);
        }
        return max;
    }
}