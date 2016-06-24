package com.Leetcode.edu;

/*
 * Reverse a linked list. Do it in-place and in one-pass.
 * */

public class ReverseLinkedList {

	static class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode reverseList(ListNode a) {

		ListNode node, prev, temp;
		node = a;
		if (node == null || node.next == null) {
			return node;
		}

		prev = null;

		while (node != null) {
			temp = node.next;
			node.next = prev;
			prev = node;
			node = temp;
		}

		return prev;

	}
}
