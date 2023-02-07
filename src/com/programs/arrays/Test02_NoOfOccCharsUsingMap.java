package com.programs.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test02_NoOfOccCharsUsingMap {
	public void findIt(String str) {
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

	public static void main(String a[]) {
		Test02_NoOfOccCharsUsingMap dcf = new Test02_NoOfOccCharsUsingMap();
		dcf.findIt("IndiaN".toUpperCase());
	}

}
