/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> point = new ArrayList<>();
        ListNode prev = head;
        head=head.next;
        int idx=1, min=Integer.MAX_VALUE, prevIdx=0;
        while(head.next!=null){
            if((prev.val<head.val && head.next.val<head.val) || (prev.val>head.val && head.next.val>head.val)){
                point.add(idx);
                if(prevIdx!=0){
                    min=Math.min(min, idx-prevIdx);
                }
                prevIdx=idx;
            }
            prev=head;
            head=head.next;
            idx++;
        }
        if(point.size()<2){
            return new int[]{-1, -1};
        }
        return new int[]{min, point.get(point.size()-1)-point.get(0)};
    }
}