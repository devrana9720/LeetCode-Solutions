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
        ListNode n=list1;
        ListNode j=list2;
        ListNode dummy=new ListNode(-1);
        ListNode k=dummy;
        while(n!=null && j!=null){
            if(n.val<=j.val){
                k.next=n;
                n=n.next;
            }
            else{
                k.next=j;
                j=j.next;
            }
            k=k.next;
        }
        if(n==null){
            k.next=j;
        }
        else{
            k.next=n;
        }
        return dummy.next;
    }
}