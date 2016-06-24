package com.Leetcode.edu;

public class ValidAnagram {
	final static int Letters_Len = 256;

	public boolean isAnagram(String s, String t) {

		if (s == null || t == null)
			return false;

		if (s.length() != t.length())
			return false;

		int len = s.length();

		int[] letters = new int[Letters_Len];

		for (int i = 0; i < len; i++) {
			letters[s.charAt(i)]++;
			letters[t.charAt(i)]--;
		}

		for (int i = 0; i < Letters_Len; i++) {
			if (letters[i] != 0) {
				return false;
			}
		}
		return true;

	}
}
