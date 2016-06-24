package com.Leetcode.edu;

public class PeakElementArray {
	public int findPeakElement(int[] nums) {

		if (nums == null || nums.length == 0) {
			return 0;
		}

		int n = nums.length;

		int start = 0;
		int end = n - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if ((mid == 0 || nums[mid - 1] <= nums[mid])
					&& (mid == n - 1 || nums[mid] >= nums[mid + 1])) {
				return mid; // array[mid] is peak element
			} else if (mid > 0 && nums[mid - 1] > nums[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
