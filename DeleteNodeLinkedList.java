package com.Leetcode.edu;

/*
 * Write a function to delete 
 * a node (except the tail) in a singly linked list, given only access to that node.
 * */
public class DeleteNodeLinkedList {

	static class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public void deleteNode(ListNode node) {
		if (node == null || node.next == null) {
			return;
		}

		ListNode temp = node.next;
		node.val = temp.val;
		node.next = temp.next;

	}
}
