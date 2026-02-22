class Solution {
    public boolean isDigitorialPermutation(int n) {
        int sum=0, res=n;
        Map<Integer, Integer> map = new HashMap<>();
        while(n>0){
            int val=n%10;
            if(map.containsKey(val)) sum+=map.get(val);
            else{
                int fact=fact(val);
                sum+=fact;
                map.put(val, fact);
            }
            // System.out.print(map.get(val)+" ");
            n/=10;
        }
        // System.out.print(sum+" "+res);
        return isPerm(Integer.toString(sum), Integer.toString(res));
    }
    static boolean isPerm(String a, String b){
        Map<Character, Integer> l = new HashMap<>(), m=new HashMap<>();
        if(a.length()!=b.length()) return false;
        for(char i:a.toCharArray()) l.put(i, l.getOrDefault(i, 0)+1);
        for(char i:b.toCharArray()) m.put(i, m.getOrDefault(i, 0)+1);
        for(Map.Entry<Character, Integer> map:l.entrySet()){
            if(!m.containsKey(map.getKey()) || m.get(map.getKey())!=map.getValue()) return false;
        }
        return true;
    }
    static int fact(int n){
        int val=1;
        for(int i=1;i<=n;i++){
            val*=i;
        }
        return val;
    }
}