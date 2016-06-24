package com.Leetcode.edu;

import java.util.ArrayList;
import java.util.List;

/*
 * Given n pairs of parentheses, write a function to generate all 
 * combinations of well-formed parentheses.
 * */
public class GenerateParenthesis {
	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<String>();
		return validParenthesis(result, n, n, "");

	}

	public List<String> validParenthesis(List<String> list, int openP,
			int closeP, String str) {

		if (openP == 0 && closeP == 0)
			list.add(str);

		if (openP > closeP)
			return list;

		if (openP > 0)
			validParenthesis(list, openP - 1, closeP, str + "(");

		if (closeP > 0)
			validParenthesis(list, openP, closeP - 1, str + ")");

		return list;
	}
}
