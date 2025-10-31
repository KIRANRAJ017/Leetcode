class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int num1=-1, num2=-1;
        boolean a[]=new boolean[nums.length+1];
        for(int i:nums){
            if(a[i]==false) a[i]=true;
            else if(num1==-1) num1=i;
            else num2=i;
        }
        return new int[]{Math.min(num1, num2), Math.max(num1, num2)};
    }
}