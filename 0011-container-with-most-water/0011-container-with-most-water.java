class Solution {
    public int maxArea(int[] h) {
       int max_water=0,srt_ind=0,end_ind=h.length-1;
       while(srt_ind < end_ind){
           int n=(end_ind - srt_ind)*Math.min(h[srt_ind],h[end_ind]);
           if( n > max_water ){
               max_water=n;
           }
           else if(h[srt_ind] < h[end_ind]){
               srt_ind++;
           }
           else{
               end_ind--;
           }
       }
       return max_water;
    }
}