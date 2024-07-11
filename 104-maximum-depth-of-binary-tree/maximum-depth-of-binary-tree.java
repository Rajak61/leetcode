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
    public int maxDepth(TreeNode root) {// //DFS -Recursion
        if(root==null){
            
            return 0;
        }
        
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
        
    }
    
//     public int maxDepth(TreeNode root) { //BFS -queue
//         if (root == null) {
//             return 0;
//         }
//         int level = 0;
//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(root);
//         while (!q.isEmpty()) {
//             int size = q.size();
//             for (int i = 0; i < size; i++) {
//                 TreeNode node = q.poll();
//                 if (node.left != null) {
//                     q.add(node.left);
//                 }
//                 if (node.right != null) {
//                     q.add(node.right);
//                 }
//             }
//             level++;
//         }
//         return level;
//     }
    
   
//     public int maxDepth(TreeNode root) { //DFS Iterative-stack
//         if (root == null) return 0;

//         Stack<TreeNode> stack = new Stack<>();
//         Stack<Integer> depths = new Stack<>();

//         stack.push(root);
//         depths.push(1);

//         int maxDepth = 0;

//         while (!stack.isEmpty()) {
//             TreeNode node = stack.pop();
//             int depth = depths.pop();

//             if (node != null) {
//                 maxDepth = Math.max(maxDepth, depth);

//                 stack.push(node.left);
//                 depths.push(depth + 1);

//                 stack.push(node.right);
//                 depths.push(depth + 1);
//             }
//         }

//         return maxDepth;
// }
}

