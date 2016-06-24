package com.Leetcode.edu;

/*
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.

 (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

 You are given a target value to search. If found in the array return its index, otherwise return -1.
 * */
public class SearchInRotatedSortedArray {
	public int search(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return -1;
		}

		int pivot = findPivot(nums);

		if (pivot > 0 && target >= nums[0] && target <= nums[pivot - 1]) {
			return binarySearch(nums, 0, pivot - 1, target);
		} else {
			return binarySearch(nums, pivot, nums.length - 1, target);
		}
	}

	public static int findPivot(int[] nums) {
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
				return mid + 1;
			} else if (nums[start] <= nums[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return 0;
	}

	public static int binarySearch(int[] array, int start, int end, int num) {

		if (array == null || array.length == 0) {
			return -1;
		}

		if (start > end || start < 0 || end >= array.length) {
			return -1;
		}

		if (num < array[start] || num > array[end]) {
			return -1;
		}

		while (start <= end) {

			int mid = (start + end) / 2;
			if (array[mid] == num) {
				return mid;
			} else if (num < array[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;
	}
}
