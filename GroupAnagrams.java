package com.Leetcode.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {

		if (strs.length == 0 || strs == null)
			return new ArrayList<List<String>>();
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		for (String s : strs) {
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			String key = String.valueOf(ch);
			if (!map.containsKey(key))
				map.put(key, new ArrayList<String>());
			map.get(key).add(s);

		}

		for (String key : map.keySet()) {
			Collections.sort(map.get(key));
		}
		return new ArrayList<List<String>>(map.values());

	}
}
