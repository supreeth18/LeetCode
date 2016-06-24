package com.Leetcode.edu;

/*
 * Given a binary tree, check whether it is a mirror of 
 * itself (ie, symmetric around its center).
 * */

public class SymmetricBinaryTree {

	static class TreeNode {
		TreeNode left, right;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public int isSymmetric(TreeNode a) {
		if (a == null)
			return 1;
		return isSymofAllLeftRightNodes(a.left, a.right);
	}

	public int isSymofAllLeftRightNodes(TreeNode l, TreeNode r) {
		if (l == null && r == null)
			return 1;
		if (l == null || r == null)
			return 0;
		if (l.val != r.val)
			return 0;
		if (isSymofAllLeftRightNodes(l.left, r.right) != 1)
			return 0;
		if (isSymofAllLeftRightNodes(l.right, r.left) != 1)
			return 0;

		return 1;
	}

}
