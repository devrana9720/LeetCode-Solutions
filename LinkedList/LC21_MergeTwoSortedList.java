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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i=list1;
        ListNode j=list2;
        ListNode dummy=new ListNode(-1);
        ListNode dupli=dummy;
        while(i!=null && j!=null){
            if(i.val<=j.val){
                dupli.next=i;
                i=i.next;
            }
            else{
                dupli.next=j;
                j=j.next;
            }
            dupli=dupli.next;
        }
        if(i==null){
            dupli.next=j;
        }
        else{
            dupli.next=i;
        }
        return dummy.next;
    }
}