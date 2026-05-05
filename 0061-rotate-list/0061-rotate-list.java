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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        ListNode fwd = head, bwd=head;
        int l=1;
        while(fwd.next!=null){
            fwd=fwd.next;
            l++;
        }
        k%=l;
        if(k==0) return head;
        fwd.next=head;
        for(int i=1;i<l-k;i++){
            bwd=bwd.next;
        }
        ListNode res = bwd.next;
        bwd.next=null;
        return res;
    }
}