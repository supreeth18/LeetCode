package com.Leetcode.edu;

import java.util.HashSet;

/*
 * Write a program to find the node at which the intersection of two singly linked lists begins.

 For example, the following two linked lists:
 * */
public class IntersectionOfLinkedList {
	static class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode a, ListNode b) {
		HashSet<ListNode> set = new HashSet<ListNode>();
		if (a == null || b == null) {
			return null;
		}

		while (a != null) {
			set.add(a);
			a = a.next;
		}

		while (b != null) {
			if (set.contains(b)) {
				return b;
			}
			b = b.next;

		}
		return null;
	}
}
