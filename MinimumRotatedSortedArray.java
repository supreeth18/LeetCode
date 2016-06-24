package com.Leetcode.edu;

/*
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.

 (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

 Find the minimum element.

 You may assume no duplicate exists in the array.
 * */
public class MinimumRotatedSortedArray {
	public int findMin(int[] nums) {
		if (nums.length == 0 || nums == null) {
			return -1;
		}

		if (nums.length == 1 && nums[0] < nums[nums.length - 1]) {
			return 0;
		}

		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;

			if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
				return nums[mid + 1];
			} else if (nums[start] <= nums[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return nums[0];
	}
}
