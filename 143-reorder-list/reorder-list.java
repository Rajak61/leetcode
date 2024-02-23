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
//time 0(n),space0(1)
 //theory -after 5:11 merge -https://www.youtube.com/watch?v=L0SZnoiS_eM
 ///code -https://walkccc.me/LeetCode/problems/0143/#__tabbed_1_2
class Solution {
    public void reorderList(ListNode head) {

        if(head==null || head.next==null)

            return;

       ListNode mid=findMid(head); 
       ListNode reversed=reverse(mid);
       merge(head,reversed);
        
    }
        private ListNode findMid(ListNode head){

            ListNode prev=null;
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null){
                prev=slow;
                slow=slow.next;
                fast=fast.next.next;
            }
            prev.next=null;
            return slow;

        }

        private ListNode reverse(ListNode head){

            ListNode current=head;
            ListNode prev=null;
            ListNode next=null;

            while(current!=null){
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;

            }
            return prev;

        }

        private void merge(ListNode l1,ListNode l2){

            while(l2!=null){
            ListNode next=l1.next;
            l1.next=l2;
            l1=l2;
            l2=next;
            }

        }
        
    
}