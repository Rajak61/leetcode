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
 //https://www.youtube.com/watch?v=jY-EUKXYT20&ab_channel=DineshVaryani
 //Time-0(n), space-0(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev=null;
        ListNode current=head;
        ListNode next=null;
        while(current!=null){
            next=current.next; //assign next node
            current.next=prev;//reverse pointer to back
            prev=current;//node back to current
            current=next;//node from current to next

        }
        return prev;
    }
}