package com.Leetcode.edu;


/*
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 * */
public class TreeFromInorderPreorder {
	static class TreeNode {
		TreeNode left, right;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	private int index = 0;

	public TreeNode buildTree(int[] preorder, int[] inorder) {

		TreeNode result = buildTree(preorder, inorder, 0, inorder.length - 1);
		return result;

	}

	public TreeNode buildTree(int[] preorder, int[] inorder, int start, int end) {
		if (start > end) {
			return null;
		}
		int i;
		for (i = start; i <= end; i++) {
			if (preorder[index] == inorder[i]) {
				break;
			}
		}

		TreeNode node = new TreeNode(preorder[index]);
		index++;
		node.left = buildTree(preorder, inorder, start, i - 1);
		node.right = buildTree(preorder, inorder, i + 1, end);
		return node;
	}
}
