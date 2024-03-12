package com.bs.yr2024Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test1_Numbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(23, 45, 67, 87, 65, 44, 33, 21, 34, 76, 54, 3, 90);
		List<Integer> numbersList;
		System.out.println(numbers);

//      sorted integers
//      numbersList=numbers.stream().sorted().collect(Collectors.toList());
//      even numbers
//      numbersList = numbers.stream().sorted().filter(num -> num % 2 == 0).collect(Collectors.toList());
//      odd numbers
//      numbersList = numbers.stream().filter(num->num%2!=0).collect(Collectors.toList());
//      square numbers
//      numbersList = numbers.stream().filter(num -> num < 20).map(num -> num * num).collect(Collectors.toList());

		numbersList = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println(numbersList);
	}
}
