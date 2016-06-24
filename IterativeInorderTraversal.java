package com.Leetcode.edu;

import java.util.ArrayList;
import java.util.Stack;

/*
 * 
 * Given a binary tree, return the inorder traversal of its nodes’ values.
 * */
public class IterativeInorderTraversal {

	static class TreeNode {
		TreeNode left, right;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public ArrayList<Integer> inorderTraversal(TreeNode a) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (a == null)
			return list;
		Stack<TreeNode> s = new Stack<TreeNode>();
		while (true) {
			if (a != null) {
				s.push(a);
				a = a.left;
			} else {
				if (s.isEmpty())
					break;
				a = s.pop();
				list.add(a.val);
				a = a.right;
			}

		}
		return list;
	}

}
