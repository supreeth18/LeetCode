package com.Leetcode.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
 * Find all unique triplets in the array which gives the sum of zero.
 * */
public class Three3SumArray {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && (nums[i] == nums[i - 1]))
				continue; // avoid duplicates
			for (int j = i + 1, k = nums.length - 1; j < k;) {
				if (nums[i] + nums[j] + nums[k] == 0) {
					list.add(Arrays.asList(nums[i], nums[j], nums[k]));
					j++;
					k--;
					while ((j < k) && (nums[j] == nums[j - 1]))
						j++;// avoid duplicates
					while ((j < k) && (nums[k] == nums[k + 1]))
						k--;// avoid duplicates
				} else if (nums[i] + nums[j] + nums[k] > 0)
					k--;
				else
					j++;
			}
		}
		return list;
	}
}
