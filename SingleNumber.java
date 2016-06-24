package com.Leetcode.edu;

/*
 * 
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * */
public class SingleNumber {
	public int singleNumber(int[] nums) {
		int xor = nums[0];
		for (int i = 1; i < nums.length; i++) {
			xor ^= nums[i];
		}
		return xor;
	}
}
