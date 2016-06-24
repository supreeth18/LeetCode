package com.Leetcode.edu;



public class CountCompleteTreeNodes {

	static class TreeNode {
		TreeNode left, right;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public int countNodes(TreeNode root) {

		if (root == null) {
			return 0;
		}

		int leftHeight = 0, rightHeight = 0;
		TreeNode p1 = root, p2 = root;

		while (p1 != null) {
			leftHeight++;
			p1 = p1.left;
		}

		while (p2 != null) {
			rightHeight++;
			p2 = p2.right;
		}

		if (leftHeight == rightHeight)
			return (1 << leftHeight) - 1;
		else
			return 1 + countNodes(root.left) + countNodes(root.right);
	}
}
