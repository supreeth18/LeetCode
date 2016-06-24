package com.Leetcode.edu;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementArray {
	PriorityQueue<Integer> pq;

	public KthLargestElementArray() {

		pq = new PriorityQueue<>(20, Collections.reverseOrder());
	}

	public int findKthLargest(int[] nums, int k) {
		for (int i = 0; i < nums.length; i++) {
			pq.offer(nums[i]);
		}

		int n = 0;
		while (k > 0) {
			n = pq.poll();
			k--;
		}
		return n;

	}
}
