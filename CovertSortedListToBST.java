package com.Leetcode.edu;

/*
 * Given a singly linked list where elements are sorted in ascending order, 
 * convert it to a height balanced BST.
 * */

public class CovertSortedListToBST {
	static class TreeNode {
		TreeNode left, right;
		int val;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	static class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public TreeNode sortedListToBST(ListNode head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return new TreeNode(head.val);
		}

		ListNode fastPtr = head;
		ListNode slowPtr = head;
		if (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
		}

		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
		}

		TreeNode root = new TreeNode(slowPtr.next.val);
		root.right = sortedListToBST(slowPtr.next.next);
		slowPtr.next = null;
		root.left = sortedListToBST(head);
		return root;
	}
}
