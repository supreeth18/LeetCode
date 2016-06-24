package com.Leetcode.edu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * Given a binary tree, return the level order traversal of its nodes' values. 
 * (ie, from left to right, level by level).
 * */
public class LevelOrderTraversal {
	static class TreeNode {
		TreeNode left, right;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> li = new ArrayList<Integer>();
		Queue<TreeNode> q1 = new LinkedList<TreeNode>();
		Queue<TreeNode> q2 = new LinkedList<TreeNode>();
		if (root == null)
			return list;

		q1.add(root);
		while (!q1.isEmpty()) {
			root = q1.poll();
			if (root.left != null) {
				q2.add(root.left);
			}
			if (root.right != null) {
				q2.add(root.right);
			}

			li.add(root.val);
			if (q1.isEmpty()) {
				q1 = q2;
				q2 = new LinkedList<TreeNode>();
				list.add(li);
				li = new ArrayList<Integer>();
			}
		}
		return list;

	}
}
