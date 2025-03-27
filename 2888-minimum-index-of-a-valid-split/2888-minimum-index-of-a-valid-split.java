class Solution {
    public int minimumIndex(List<Integer> nums) {
        int maxNum=0, max=0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
            if(map.get(i)>max){
                max=map.get(i);
                maxNum=i;
            }
        }  
        int arr[]=new int[nums.size()];
        int cnt=0, non=0;
        for(int i:nums) if(i!=maxNum) non++;
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==maxNum) cnt++;
            else non--;
            System.out.print(cnt+" ");
            if(cnt>i+1-cnt && (max-cnt)>non){
                return i;
            }
        }
        return -1;
    }
}