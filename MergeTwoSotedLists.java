package com.Leetcode.edu;

public class MergeTwoSotedLists {
	static class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode resultNode = null;
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		}

		if (l1.val <= l2.val) {
			resultNode = l1;
			resultNode.next = mergeTwoLists(l1.next, l2);
		} else {
			resultNode = l2;
			resultNode.next = mergeTwoLists(l1, l2.next);
		}
		return resultNode;

	}
}
