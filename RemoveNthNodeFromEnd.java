package com.Leetcode.edu;

/*
 * Given a linked list, remove the nth node from the end of list and return its head.
 * */
public class RemoveNthNodeFromEnd {

	static class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode removeNthFromEnd(ListNode a, int b) {
		if (a == null)
			return null;

		ListNode fast = a;
		ListNode slow = a;

		for (int i = 0; i < b; i++) {

			fast = fast.next;

			// if remove the first node
			if (fast == null) {
				a = a.next;
				return a;
			}

		}

		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}

		slow.next = slow.next.next;

		return a;
	}
}
