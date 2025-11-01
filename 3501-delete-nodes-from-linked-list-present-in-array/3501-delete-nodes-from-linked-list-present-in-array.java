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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> l = new HashSet<>();
        ListNode temp = head, node=null;
        for(int i:nums){
            l.add(i);
        }
        while(temp!=null){
            if(!l.contains(temp.val)){
                if(node==null){
                    node = temp;
                    head=node;
                }
                else{
                    node.next=temp;
                    node=node.next;
                }
            }
            temp=temp.next;
        }
        node.next=null;
        return head;
    }
}