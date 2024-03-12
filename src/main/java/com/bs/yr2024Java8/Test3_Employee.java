package com.bs.yr2024Java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test3_Employee {
	public static void main(String[] args) {
		List<Employee> list = Employee.getEmployees();
		List<Employee> result;
		
//		sorting employee by ID
//		result = list.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getId)).collect(Collectors.toList());
//		display(result);

//		Map<Integer, String> collect = list.stream().collect(Collectors.toMap(Employee::getAge, Employee::getName));
//		System.out.println(collect);
		
		String collect = list.stream().map(Employee::getName).collect(Collectors.joining(",","1__","__2"));
		System.out.println(collect);
	}

	private static void display(List<Employee> empList) {
		empList.forEach(emp -> System.out.println(emp.name + " "));
	}
}
