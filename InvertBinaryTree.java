package com.Leetcode.edu;

/*
 * Given a binary tree, invert the binary tree and return it. 
 * */

public class InvertBinaryTree {
	static class TreeNode {
		TreeNode left, right;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public TreeNode invertTree(TreeNode root) {
		if (root != null) {
			helper(root);
		}
		return root;
	}

	public void helper(TreeNode p) {
		TreeNode temp = p.left;
		p.left = p.right;
		p.right = temp;

		if (p.left != null)
			helper(p.left);
		if (p.right != null)
			helper(p.right);
	}
}
