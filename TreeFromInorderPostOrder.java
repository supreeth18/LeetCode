package com.Leetcode.edu;


/*
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 * */
public class TreeFromInorderPostOrder {
	static class TreeNode {
		TreeNode left, right;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		int inorderL = inorder.length;
		int postorderL = postorder.length;
		if (inorderL == 0 || postorderL == 0 || inorderL != postorderL)
			return null;
		return buildTree(inorder, 0, inorderL - 1, postorder, 0, postorderL - 1);

	}

	public TreeNode buildTree(int[] inorder, int startInorder, int endInorder,
			int[] postorder, int startPostorder, int endPostorder) {
		if (startInorder > endInorder || startPostorder > endPostorder)
			return null;
		TreeNode parent = new TreeNode(postorder[endPostorder]);
		int indexFindForInorder = findInorderIndex(inorder, startInorder,
				endInorder, postorder[endPostorder]);
		int remIndex = endInorder - indexFindForInorder;
		TreeNode leftSubTree = buildTree(inorder, startInorder,
				indexFindForInorder - 1, postorder, startPostorder,
				endPostorder - remIndex - 1);
		TreeNode rightSubTree = buildTree(inorder, indexFindForInorder + 1,
				endInorder, postorder, endPostorder - remIndex,
				endPostorder - 1);
		parent.left = leftSubTree;
		parent.right = rightSubTree;
		return parent;

	}

	public int findInorderIndex(int[] inorder, int start, int end, int target) {
		for (int i = start; i <= end; i++) {
			if (inorder[i] == target)
				return i;
		}
		return -1;
	}
}
