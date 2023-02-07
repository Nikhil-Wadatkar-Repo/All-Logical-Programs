package com.bs.logics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public final class Rough {
	private static List<Integer> collect;

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(23, 12, 34, 45, 45, 12);
		List<String> names = Arrays.asList("hi", "hello", "helloall");

		// largest number using max by
		Integer max = numbers.stream().max(Comparator.comparing(num -> num)).get();
		System.out.println("maximum number: " + max);

		// largest number using reduce()
		Integer reduceMax = numbers.stream().reduce((num1, num2) -> num1 > num2 ? num1 : num2).get();
		System.out.println("maximum number: " + reduceMax);

		collect = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique: " + collect);

		String largetString = names.stream().max(Comparator.comparing(String::length)).get();
		System.out.println(largetString);
//		names.stream().reduce(Comparator.comparing(String::length))
		String string = names.stream().reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2).get();
		System.out.println(string);
	}
}
