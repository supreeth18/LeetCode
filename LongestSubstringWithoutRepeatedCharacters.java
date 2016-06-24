package com.Leetcode.edu;

/*
 * Given a string, find the length of the longest substring without repeating characters.
 * */
public class LongestSubstringWithoutRepeatedCharacters {
	public int lengthOfLongestSubstring(String s) {

		int result = 0;
		int[] cache = new int[256];
		for (int i = 0, j = 0; i < s.length(); i++) {
			j = (cache[s.charAt(i)] > 0) ? Math.max(j, cache[s.charAt(i)]) : j;
			cache[s.charAt(i)] = i + 1;
			result = Math.max(result, i - j + 1);
		}
		return result;
	}
}
