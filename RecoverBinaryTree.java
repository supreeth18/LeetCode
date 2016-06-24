package com.Leetcode.edu;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 
 * Two elements of a binary search tree (BST) are swapped by mistake.
 Tell us the 2 values swapping which the tree will be restored.
 * */
public class RecoverBinaryTree {
	static class TreeNode {
		TreeNode left, right;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public ArrayList<Integer> recoverTree(TreeNode a) {
		ArrayList<Integer> res = new ArrayList<>();
		ArrayList<Integer> inorder = new ArrayList<>();

		inorder(inorder, a);

		ArrayList<Integer> sorted = new ArrayList<>(inorder);
		Collections.sort(sorted);

		int i = 0;

		for (int num : sorted) {
			if (inorder.get(i) != num) {
				res.add(num);
			}
			i++;
		}

		return res;

	}

	public void inorder(ArrayList<Integer> in, TreeNode node) {

		if (node == null)
			return;

		inorder(in, node.left);
		in.add(node.val);
		inorder(in, node.right);

	}
}
