package com.Leetcode.edu;

import java.util.List;

/*
 * Given an array where elements are sorted in ascending order, 
 * convert it to a height balanced BST.
 * */
public class SortedArrayToBalancedBst {

	static class TreeNode {
		TreeNode left, right;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public TreeNode sortedArrayToBST(final List<Integer> a) {
		return sortedToBst(a, 0, a.size() - 1);
	}

	public TreeNode sortedToBst(List<Integer> a, int start, int end) {
		if (start > end)
			return null;
		int mid = (start + end) / 2;
		TreeNode root = new TreeNode(a.get(mid));
		root.left = sortedToBst(a, start, mid - 1);
		root.right = sortedToBst(a, mid + 1, end);
		return root;
	}

}
