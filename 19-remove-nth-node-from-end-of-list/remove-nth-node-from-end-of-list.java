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
 //Time 0(n),space 0(1)
 //Theory -https://www.youtube.com/watch?v=XVuQxVej6y8&list=TLPQMTkwMjIwMjT6TONIvz9_GQ&index=2
 //Theory -https://www.youtube.com/watch?v=6gI8OMoac4Q&list=TLPQMTkwMjIwMjT6TONIvz9_GQ&index=2
 ///code-https://www.youtube.com/watch?v=6gI8OMoac4Q&list=TLPQMTkwMjIwMjT6TONIvz9_GQ&index=2s
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next=head;

        ListNode first=dummy;
        ListNode second=dummy;
        //increment second till n space  ,intialize second 
        for(int i=0;i<n;i++){
            second = second.next;
        }
        //move until second is null
        while(second.next!=null){
            first=first.next;
            second=second.next;
        }

        first.next=first.next.next; ///remove the node
        return dummy.next;
    }
}