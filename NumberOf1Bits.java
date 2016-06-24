package com.Leetcode.edu;

/*
 * Write a function that takes an unsigned integer and returns the number of 1 bits it has.
 * */
public class NumberOf1Bits {
	public int numSetBits(long a) {
		long count = 0;
		while (a > 0) {
			count += a & 1;
			a >>= 1;
		}
		return (int) count;
	}
}
