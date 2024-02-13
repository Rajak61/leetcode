/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 //Floyd's Tortoise and Hare
 //https://www.youtube.com/watch?v=gBTe7lFR3vc&ab_channel=NeetCode
 //Time-0(n), space 0(1)
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head!=null){           
        ListNode slow=head;
        ListNode fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            return true;

        }
        }
        return false;
        
    }
}