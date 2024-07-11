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
///Time:0(n),space 0(1)
	//Theory https://www.youtube.com/watch?v=hTM3phVI6YQ&ab_channel=NeetCode ---DFS recusrsion
	//Code -https://walkccc.me/LeetCode/problems/104/#__tabbed_1_2
    // code and theory BFS- https://www.youtube.com/watch?v=o2LEC2NEVuk&ab_channel=NikhilLohia 
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            
            return 0;
        }
        
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
        
    }
}