package com.Leetcode.edu;

/*
 * Given an input string, reverse the string word by word.
 * */
public class ReverseString {
	public String reverseWords(String a) {
		if (a == null || a.length() == 0) {
			return "";
		}

		// split to words by space
		String[] arr = a.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; --i) {
			if (!arr[i].equals("")) {
				sb.append(arr[i]).append(" ");
			}
		}
		return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
	}
}
