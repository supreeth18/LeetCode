package com.Leetcode.edu;

/*
 * Given a binary tree, determine if it is height-balanced.
 * */

public class BalancedBinaryTree {

	static class TreeNode {
		TreeNode left, right;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public int isBalanced(TreeNode a) {
		if (checkHeight(a) == -1)
			return 0;
		else
			return 1;
	}

	int checkHeight(TreeNode a) {
		if (a == null)
			return 0;

		int leftHeight = checkHeight(a.left);
		if (leftHeight == -1)
			return -1;

		int rightHeight = checkHeight(a.right);
		if (rightHeight == -1)
			return -1;

		int heightDifference = leftHeight - rightHeight;
		if (Math.abs(heightDifference) > 1)
			return -1;
		else
			return Math.max(leftHeight, rightHeight) + 1;
	}

}
