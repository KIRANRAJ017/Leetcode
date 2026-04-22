class Solution {
    public List<String> twoEditWords(String[] q, String[] d) {
        List<String> res = new ArrayList<>();
        for(int i=0;i<q.length;i++){
            for(int j=0;j<d.length;j++){
                if(q[i].length()==d[j].length() && (q[i].equals(d[j]) || diff(q[i], d[j])<=2)){
                    res.add(q[i]); break;
                }
            }
        }
        return res;
    }
    static int diff(String a, String b){
        int cnt=0;
        for(int i=0;i<a.length();i++){
            cnt+=a.charAt(i)!=b.charAt(i)?1:0;
        }
        return cnt;
    }
}