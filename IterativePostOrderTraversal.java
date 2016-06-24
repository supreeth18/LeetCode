package com.Leetcode.edu;

import java.util.ArrayList;
import java.util.Stack;

/*
 * Given a binary tree, return the postorder traversal of its nodes’ values.
 * 
 * */

public class IterativePostOrderTraversal {

	static class TreeNode {
		TreeNode left, right;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public ArrayList<Integer> postorderTraversal(TreeNode a) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (a == null)
			return list;
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		Stack<TreeNode> s2 = new Stack<TreeNode>();

		s1.push(a);
		while (!s1.isEmpty()) {
			a = s1.pop();
			s2.push(a);
			if (a.left != null)
				s1.push(a.left);
			if (a.right != null)
				s1.push(a.right);

		}
		while (!s2.isEmpty()) {
			a = s2.pop();
			list.add(a.val);
		}
		return list;
	}
}
