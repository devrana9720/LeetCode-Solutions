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
        ListNode duplicate=dummy;
        while(i!=null && j!=null){
            if(i.val<=j.val){
                duplicate.next=i;
                i=i.next;
            }
            else{
                duplicate.next=j;
                j=j.next;
            }
            duplicate=duplicate.next;
        }
        if(i==null){
            duplicate.next=j;
        }
        else{
            duplicate.next=i;
        }
        return dummy.next;
    }
}