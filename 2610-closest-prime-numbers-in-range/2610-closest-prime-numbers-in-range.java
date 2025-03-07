class Solution {
    public int[] closestPrimes(int left, int right) {
        int min=Integer.MAX_VALUE;
        List<Integer> l = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(prime(i)) l.add(i);
        }
        int num1=-1, num2=-1;
        for(int i=0;i<l.size()-1;i++){
            int dis=l.get(i+1)-l.get(i);
            if(dis<min){
                min=dis;
                num1=l.get(i);
                num2=l.get(i+1);
            }
        }
        return new int[]{num1, num2};
    }
    static boolean prime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}