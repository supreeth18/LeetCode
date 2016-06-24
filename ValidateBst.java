package com.Leetcode.edu;

/*
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * Assume a BST is defined as follows: The left subtree of a node contains only 
 * nodes with keys less than the node’s key. The right subtree of a node contains 
 * only nodes with keys greater than the node’s key. Both the left and right subtrees 
 * must also be binary search trees.
 * 
 * */

public class ValidateBst {
	static class TreeNode {
		TreeNode left, right, next;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public int isValidBST(TreeNode a) {
		return binaryTreeIsBinarySearchTree(a, Integer.MIN_VALUE,
				Integer.MAX_VALUE);
	}

	public int binaryTreeIsBinarySearchTree(TreeNode a, Integer min, Integer max) {
		if (a == null)
			return 1;
		if ((min != null && a.val <= min) || (max != null && a.val >= max))
			return 0;
		if ((binaryTreeIsBinarySearchTree(a.left, min, a.val) == 1 && (binaryTreeIsBinarySearchTree(
				a.right, a.val, max) == 1))) {
			return 1;
		}

		return 0;

	}
}
