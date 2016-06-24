package com.Leetcode.edu;

/*
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * */
public class AddDigits {
	public int addDigits(int num) {

		if (num == 0)
			return 0;

		while (num >= 10) {
			int res = num % 10;
			num = res + num / 10;
		}

		return num;
	}
}
