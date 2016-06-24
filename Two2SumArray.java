package com.Leetcode.edu;

import java.util.HashMap;

/*
 * Given an array of integers, return indices of the 
 * two numbers such that they add up to a specific target.
 * */
public class Two2SumArray {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int index = map.get(nums[i]);
				result[0] = index + 1;
				result[1] = i + 1;

			} else {
				map.put(target - nums[i], i);
			}
		}

		return result;
	}
}
