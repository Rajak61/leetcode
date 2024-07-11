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

//time 0(n), space 0(h)
// Theory- https://www.youtube.com/watch?v=OnSn2XEQ4MY&ab_channel=NeetCode
//code -https://walkccc.me/LeetCode/problems/226/#__tabbed_1_2
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return null;
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        invertTree(root.left);
        invertTree(root.right);
        return root;
        
    }
}