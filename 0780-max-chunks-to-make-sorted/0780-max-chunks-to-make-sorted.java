class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length, max=0, a[]=new int[n];
        for(int i=0;i<n;i++){
            max=Math.max(max, arr[i]);
            a[i]=max;
        }
        int chunk=0;
        for(int i=0;i<n;i++){
            if(a[i]==i) chunk++;
        }
        return chunk;
    }
}