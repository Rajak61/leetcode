/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 //Theory -https://www.youtube.com/watch?v=s6ATEkipzow&ab_channel=NeetCode
 //Time: $O(n)//Space: $O(n)
class Solution {
    public boolean isValidBST(TreeNode root) {
       
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean valid(TreeNode node, long left, long right) {
        if (node == null) {
            return true;
        }
        if (!(node.val < right && node.val > left)) {
            return false;
        }
        return valid(node.left, left, node.val) && valid(node.right, node.val, right);
    }

    
}