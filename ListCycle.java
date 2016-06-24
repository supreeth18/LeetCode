package com.Leetcode.edu;

import java.util.HashSet;

/*
 * Given a linked list, return the node where the cycle begins. 
 * If there is no cycle, return null. Try solving it using constant additional space.
 * */

public class ListCycle {

	static class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode detectCycle(ListNode a) {
		HashSet<ListNode> hashSet = new HashSet<ListNode>();

		while (a != null) {
			if (hashSet.contains(a)) {
				return a;
			} else {
				hashSet.add(a);
				a = a.next;
			}

		}

		return null;
	}
}
