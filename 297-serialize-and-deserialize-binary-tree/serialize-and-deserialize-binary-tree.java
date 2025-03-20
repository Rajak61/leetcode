import java.util.*;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}
public class Codec {
    public static String serialize(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		dfs(root,sb);
		return sb.toString();
	}
	
	public static void dfs(TreeNode root,StringBuilder sb){
		if (root == null) {
			sb.append("N,");
			return;
		}
		sb.append(root.val).append(",");
		dfs(root.left,sb);
		dfs(root.right,sb);
	
		
	}

	public static TreeNode deserialize(String data) {

		String arr[] = data.split(",");
		Queue<String> q = new ArrayDeque<>(Arrays.asList(arr));

		return dfs(q);

	}

	public static TreeNode dfs(Queue<String> q) {
		String s = q.poll();
		if (s.equals("N")) {
			return null;

		}
		TreeNode root = new TreeNode(Integer.parseInt(s));
		root.left = dfs(q);
		root.right = dfs(q);
		return root;
	}
}