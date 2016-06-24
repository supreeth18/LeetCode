package com.Leetcode.edu;

/*
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 * */
public class UniqueBst {
	public int numTrees(int n) {
		int[] solutions = new int[n + 1];

		for (int i = 0; i <= n; i++)
			solutions[i] = -1;

		return computePossibility(n, solutions);
	}

	public static int computePossibility(int n, int[] solutions) {

		int possibility = 0;
		if (n == 0 || n == 1)
			return 1;

		for (int i = 0; i < n; i++) {
			if (solutions[i] == -1)
				solutions[i] = computePossibility(i, solutions);

			if (solutions[n - 1 - i] == -1)
				solutions[n - 1 - i] = computePossibility(n - 1 - i, solutions);

			possibility += solutions[i] * solutions[n - 1 - i];
		}
		return possibility;
	}
}
