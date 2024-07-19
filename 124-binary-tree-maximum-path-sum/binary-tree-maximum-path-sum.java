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
class Solution {
    private int maxSum = Integer.MIN_VALUE;

    public int solve(TreeNode root) {

       if (root == null) {
            return 0;
        }

        int leftSum = solve(root.left);
        int rightSum = solve(root.right);

        // (1) Calculate the sum including the current node and its children
        int includingCurrent = leftSum + rightSum + root.val;

        // (2) Calculate the maximum sum considering only one child and the current node
        int maxChildPlusCurrent = Math.max(leftSum, rightSum) + root.val;

        // (3) Consider the current node only
        int onlyRoot = root.val;

        // Update the overall maximum path sum
        maxSum = Math.max(Math.max(maxSum,onlyRoot), Math.max(includingCurrent, maxChildPlusCurrent));

        // (4) Important part: return the maximum path sum that can be continued from the current node
        return Math.max(maxChildPlusCurrent, onlyRoot);
    }

    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;

        solve(root);

        return maxSum;
    }
}

