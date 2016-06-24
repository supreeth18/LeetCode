package com.Leetcode.edu;

import java.util.Stack;

public class SeriaLizeDseriaLizeBinaryTree {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public String serialize(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		Stack<TreeNode> s = new Stack<TreeNode>();
		if (root == null) {
			return null;
		}

		s.push(root);
		while (!s.isEmpty()) {
			TreeNode resNode = s.pop();
			if (resNode != null) {
				sb.append(resNode.val + ",");
				s.push(resNode.right);
				s.push(resNode.left);
			} else {
				sb.append("#,");
			}
		}
		return sb.toString().substring(0, sb.length() - 1);

	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		if (data == null) {
			return null;
		}

		int[] index = { 0 };
		String[] arr = data.split(",");
		return helperMethodForDeserialize(arr, index);
	}

	public TreeNode helperMethodForDeserialize(String[] array, int[] index) {
		if (array[index[0]].equals("#")) {
			return null;
		}

		TreeNode root = new TreeNode(Integer.parseInt(array[index[0]]));
		index[0] = index[0] + 1;
		root.left = helperMethodForDeserialize(array, index);
		index[0] = index[0] + 1;
		root.right = helperMethodForDeserialize(array, index);

		return root;
	}
}
