package com.Leetcode.edu;

/*
 * Given a binary tree, find its maximum depth.

 The maximum depth is the number of nodes along the longest 
 path from the root node down to the nearest leaf node.
 * */

public class MaxDepthofBinaryTree {
	static class TreeNode {
		TreeNode left, right;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public int maxDepth(TreeNode a) {
		if (a == null) {
			return 0;
		}
		if (a.left == null && a.right == null)
			return 1;
		if (a.left == null) {
			return 1 + maxDepth(a.right);
		} else if (a.right == null) {
			return 1 + maxDepth(a.left);
		} else
			return 1 + Math.max(maxDepth(a.left), maxDepth(a.right));
	}
}
