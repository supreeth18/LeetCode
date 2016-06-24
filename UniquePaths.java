package com.Leetcode.edu;

/*
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

 The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

 How many possible unique paths are there?
 * */
public class UniquePaths {
	public int uniquePaths(int m, int n) {

		int ways[][] = new int[m][n];
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				if (i == 0 && j == 0)
					ways[i][j] = 1;
				else if (i == 0)
					ways[i][j] = ways[i][j - 1];
				else if (j == 0)
					ways[i][j] = ways[i - 1][j];
				else
					ways[i][j] = ways[i - 1][j] + ways[i][j - 1];
			}
		}

		return ways[m - 1][n - 1];
	}
}
