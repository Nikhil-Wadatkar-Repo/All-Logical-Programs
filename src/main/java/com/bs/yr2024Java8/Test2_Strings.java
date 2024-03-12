package com.bs.yr2024Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test2_Strings {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("bandhu", "ankur", "nikhil", "puja", "dhanu", "ma", "gaurav", "nitin", "eve",
				"faruq");
		List<String> results;
		
//		results=names.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
		results=names.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
		
		System.out.println(results);
		
		
	}
}
