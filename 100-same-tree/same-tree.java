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
//Theory -https://www.youtube.com/watch?v=vRbbcKXCxOw&ab_channel=NeetCode
//Code- https://walkccc.me/LeetCode/problems/100/
//Time 0(n) ,space (h)
class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
        
//        if (p == null || q == null)
//             return p == q;
//          return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//     }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
       
        if (p == null && q == null) {
                 return true;
            }
         if (p == null || q == null || p.val!= q.val) {
                return false;
             }
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
}
}