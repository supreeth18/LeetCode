package com.Leetcode.edu;

public class MajorityElement {
	public int majorityElement(int[] nums) {
		int count = 0;
		if (nums.length == 0 || nums == null)
			return 0;

		int candidate = 0;
		for (int i = 0; i < nums.length; i++) {
			if (count == 0) {
				candidate = nums[i];
				count = 1;
				continue;
			} else {
				if (candidate == nums[i]) {
					count++;
				} else {
					count--;
				}
			}
		}

		if (count == 0) {
			return 0;
		}

		count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (candidate == nums[i]) {
				count++;
			}
		}
		return count > nums.length / 2 ? candidate : 0;

	}
}
