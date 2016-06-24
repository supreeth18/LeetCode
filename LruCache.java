package com.Leetcode.edu;

import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache extends LinkedHashMap<Integer, Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9072778437213911607L;
	private int capacity;

	public LruCache(int capacity) {
		super(capacity, 0.75f, true);
		this.capacity = capacity;
	}

	protected boolean removeEldestEntry(Map.Entry<Integer, Integer> entry) {
		return this.size() > capacity;
	}

	public int get(int key) {
		if (this.containsKey(key)) {
			return super.get(key);
		} else {
			return -1;
		}
	}

	public void set(int key, int value) {
		super.put(key, value);
	}
}
