package com.Leetcode.edu;

/*
 * Given a binary tree, find the maximum path sum.

 For this problem, a path is defined as any sequence of nodes 
 from some starting node to any node in the tree along the parent-child connections. 
 The path does not need to go through the root.
 * */
public class BinaryTreeMaximumPathSum {

	static class TreeNode {
		TreeNode left, right;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	int max = Integer.MIN_VALUE;

	public int maxPathSum(TreeNode root) {
		helper(root);
		return max;
	}

	public int helper(TreeNode root) {
		if (root == null)
			return Integer.MIN_VALUE;
		int left = Math.max(0, helper(root.left));
		int right = Math.max(0, helper(root.right));
		max = Math.max(max, root.val + left + right);
		return root.val + Math.max(left, right);

	}
}
