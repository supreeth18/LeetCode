package com.Leetcode.edu;

/*
 * Given two binary trees, write a function to check if they are equal or not.
 Two binary trees are considered equal if they are structurally identical 
 and the nodes have the same value.
 * 
 * */
public class IdenticalBinaryTree {
	static class TreeNode {
		TreeNode left, right;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public int isSameTree(TreeNode a, TreeNode b) {
		if (a == null && b == null)
			return 1;
		else if ((a != null && b == null) || (a == null && b != null)) {
			return 0;
		} else if ((a.val == b.val) && isSameTree(a.left, b.left) == 1
				&& isSameTree(a.right, b.right) == 1) {
			return 1;
		} else {
			return 0;
		}
	}

}
