package com.Leetcode.edu;

/*
 * Given a string S, you are allowed to convert it to a palindrome by adding 
 * characters in front of it. 
 * Find and return the shortest palindrome you can find by performing this transformation.
 * */
public class ShortestPalindrome {
	public String shortestPalindrome(String s) {
		String rev_s = new StringBuilder(s).reverse().toString();

		String l = s + "#" + rev_s;

		int[] p = new int[l.length()];

		for (int i = 1; i < l.length(); i++) {

			int j = p[i - 1];

			while (j > 0 && l.charAt(i) != l.charAt(j))
				j = p[j - 1];

			if (l.charAt(i) == l.charAt(j))
				p[i] = j + 1;
		}

		return rev_s.substring(0, s.length() - p[l.length() - 1]) + s;
	}
}
