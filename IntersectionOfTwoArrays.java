package com.Leetcode.edu;

import java.util.Arrays;
import java.util.BitSet;

public class IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {

		if (nums1.length == 0 || nums2.length == 0)
			return new int[0];
		int n1 = nums1.length;
		int n2 = nums2.length;
		int[] result = new int[Math.min(n1, n2)];
		int i = 0;
		BitSet set = new BitSet();
		for (i = 0; i < n1; i++) {
			set.set(nums1[i]);
		}
		int count = 0;
		for (i = 0; i < n2; i++) {
			if (set.get(nums2[i])) {
				result[count++] = nums2[i];
				set.set(nums2[i], false);
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
