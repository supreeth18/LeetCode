package com.Leetcode.edu;

import java.util.ArrayList;

/*
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such 
 * that adding up all the values along the path equals the given sum.
 * */
public class PathSum {

	static class TreeNode {
		TreeNode left, right;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public boolean hasPathSum(TreeNode root, int sum) {

		ArrayList<Integer> result = new ArrayList<Integer>();

		return hasPath(root, sum, result);

	}

	public boolean hasPath(TreeNode root, int sum, ArrayList<Integer> res) {

		if (root == null)
			return false;

		if (root.left == null && root.right == null) {
			if (root.val == sum) {
				res.add(root.val);
				return true;
			}
			return false;
		}

		if (hasPath(root.left, sum - root.val, res)) {
			res.add(root.val);
			return true;
		}

		else if (hasPath(root.right, sum - root.val, res)) {
			res.add(root.val);
			return true;
		}

		return false;

	}
}
