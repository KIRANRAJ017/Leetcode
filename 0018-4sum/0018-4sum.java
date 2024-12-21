class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int l=j+1,r=nums.length-1;
                long sum=nums[i]+nums[j];
                while(l<r){
                    if(sum+nums[l]+nums[r]==target){
                        List<Integer> lis=new ArrayList<>();
                        Collections.addAll(lis,nums[i],nums[j],nums[l],nums[r]);
                        if(!list.contains(lis)){
                            list.add(lis);
                        }
                        l++;
                        r--;
                    }
                    else if(sum+nums[l]+nums[r]>target){
                        r--;
                    }
                    else{
                        l++;
                    }
                }
            }
        }
        return list;
    }
}