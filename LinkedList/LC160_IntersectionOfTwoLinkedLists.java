/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int ntemp1=0;
        ListNode temp1=headA;
        while(temp1 !=null){
            temp1=temp1.next;
            ntemp1++;
        }
        ListNode temp2=headB;
        int ntemp2=0;
        while(temp2!=null){
            temp2=temp2.next;
            ntemp2++;
        }
        int difference=Math.abs(ntemp1-ntemp2);
        temp1=headA;
        temp2=headB;
        if(ntemp1>ntemp2){
            for(int i=0;i<difference;i++){
                temp1=temp1.next;
            }
        }
        else{
            for(int i=0;i<difference;i++){
                temp2=temp2.next;
            }
        }
        
        while(temp1!=null && temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
        
    }
}