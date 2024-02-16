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
 //Theory-https://www.youtube.com/watch?v=QG7AVdPbgb4&ab_channel=KnowledgeCenter
 //letcode java solution  Merge sort
 //time -0(n*logk),space-0(1)
 //other solutio using priortiy queue-time -0(n*logk),space-0(k)-https://medium.com/javarevisited/java-algorithms-merge-k-sorted-lists-leetcode-84c99000bfd7
 //https://walkccc.me/LeetCode/problems/0023/#__tabbed_1_2
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
      // Base condition
        if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeKLists(lists, 0, lists.length - 1);
    }

    private ListNode mergeKLists(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }
        // Mid of list of lists
        int mid = start + (end - start) / 2;
        // Recursive call for left sublist
        ListNode left = mergeKLists(lists, start, mid);
        // Recursive call for right sublist
        ListNode right = mergeKLists(lists, mid + 1, end);
        // Merge the left and right sublist
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        // Create a dummy node
        ListNode head = new ListNode(-1);
        // Temp node
        ListNode temp = head;
        // Loop until any of the list becomes null
        while (left != null && right != null) {
            // Choose the value from the left and right which is smaller
            if (left.val < right.val) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        // Take all nodes from left list if remaining
        if (left != null) {
            temp.next = left;
          //  left = left.next;
            //temp = temp.next;
        }
        // Take all nodes from right list if remaining
        if (right != null) {
            temp.next = right;
            //right = right.next;
            //temp = temp.next;
        }
        return head.next;
    }
    
}