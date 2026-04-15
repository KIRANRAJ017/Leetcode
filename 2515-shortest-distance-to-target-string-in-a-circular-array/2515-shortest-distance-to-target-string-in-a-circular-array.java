class Solution {
    public int closestTarget(String[] words, String target, int idx) {
        int n=words.length, left=idx, right=idx;
        int lcnt=0, rcnt=0;
        if(words[idx].equals(target)) return 0;
        for(int i=0;i<n;i++){
            if(words[(left-1+n)%n].equals(target)){
                lcnt++; break;
            }
            left--;
            lcnt++;
        }
        for(int i=0;i<n;i++){
            if(words[(right+1)%n].equals(target)){
                rcnt++; break;
            }
            right++;
            rcnt++;
        }
        return Math.min(lcnt, rcnt)==n?-1:Math.min(lcnt, rcnt);
    }
}