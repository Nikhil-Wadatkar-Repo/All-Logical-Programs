package com.interview.programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class ImmutableClass {
	private final int id;
	private final String name;
	private final List<String> favColors;

	public ImmutableClass(int id, String name, List<String> favColors) {
		super();
		this.id = id;
		this.name = name;

		List<String> favColors1 = new LinkedList<>();

		for (String str : favColors) {
			favColors1.add(str);
		}

		this.favColors = favColors1;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<String> getFavColors() {
		return favColors;
	}

}

public class Test05 {

	public static void main(String[] args) {

		String[] arr = { "flower", "flow", "flight" };
		String shortestString = "";

		int minLenght = arr[0].length();

		for (int i = 0; i < arr.length; i++) {

		}

	}

}
