package com.Leetcode.edu;

import java.util.ArrayList;
import java.util.Stack;

/*
 * Given a binary tree, return the preorder traversal of its nodes’ values.
 * */
public class IterativePreOrderTraversal {

	static class TreeNode {
		TreeNode left, right;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public ArrayList<Integer> preorderTraversal(TreeNode a) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (a == null)
			return list;
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(a);
		while (!s.isEmpty()) {
			a = s.pop();
			list.add(a.val);

			if (a.right != null)
				s.push(a.right);
			if (a.left != null)
				s.push(a.left);
		}
		return list;

	}
}
