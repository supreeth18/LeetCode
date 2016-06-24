package com.Leetcode.edu;

/*
 * Populate each next pointer to point to its next right node. 
 * If there is no next right node, the next pointer should be set to NULL.
 * */
import java.util.LinkedList;
import java.util.Queue;

public class PopulationNextRightNodePointers {
	static class TreeNode {
		TreeNode left, right, next;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public void connect(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (root == null)
			return;

		queue.add(root);
		queue.add(null);

		while (!queue.isEmpty()) {
			TreeNode current = queue.poll();
			if (current == null) {
				if (queue.isEmpty())
					break;
				queue.add(null);
			} else {
				current.next = queue.peek();
				if (current.left != null)
					queue.add(current.left);
				if (current.right != null)
					queue.add(current.right);
			}
		}
	}
}
