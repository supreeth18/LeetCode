package com.Leetcode.edu;

/*
 * Given a binary tree, find its minimum depth.

 The minimum depth is the number of nodes along the 
 shortest path from the root node down to the nearest leaf node.
 * */

public class MinDepthBinaryTree {

	static class TreeNode {
		TreeNode left, right;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public int minDepth(TreeNode a) {
		if (a == null) {
			return 0;
		}
		if (a.left == null && a.right == null)
			return 1;
		if (a.left == null) {
			return 1 + minDepth(a.right);
		} else if (a.right == null) {
			return 1 + minDepth(a.left);
		} else
			return 1 + Math.min(minDepth(a.left), minDepth(a.right));
	}
}
