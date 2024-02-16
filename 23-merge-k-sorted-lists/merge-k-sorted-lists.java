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
 //core login merge two sort
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

    private ListNode merge(ListNode list1, ListNode list2) {
        // Create a dummy node
        ListNode dummy = new ListNode(0);
        // Temp node
        ListNode tail = dummy;
        // Loop until any of the list becomes null
        while (list1 != null && list2 != null) {
            // Choose the value from the left and right which is smaller
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        // Take all nodes from left list if remaining
        if (list1 != null) {
            tail.next = list1;
        }
        // Take all nodes from right list if remaining
        if (list2!= null) {
            tail.next = list2;
        }
        return dummy.next;
    }
    
}