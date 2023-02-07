package com.roughWork.ganya;

import java.util.HashMap;
import java.util.Map;

public class Rough {
	public static void main(String[] args) {
		String str = "Indian".toLowerCase();
		Map<Character, Integer> baseMap = new HashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		for (Character ch : charArray) {
			if (ch != ' ') {
				if (baseMap.containsKey(ch)) {
					baseMap.put(ch, baseMap.get(ch) + 1);
				} else {
					baseMap.put(ch, 1);
				}
			}
		}
		System.out.println(baseMap);
	}

}
