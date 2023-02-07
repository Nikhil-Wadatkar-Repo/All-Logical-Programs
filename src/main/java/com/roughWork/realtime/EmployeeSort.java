package com.roughWork.realtime;


import com.roughWork.rough.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> listEmployees = Employee.getEmployees();


//        listEmployees.stream().sorted(Comparator.comparing(Employee::getId)).map(emp-> emp.getId()).forEach(System.out::println);
        List<Employee> names=listEmployees.stream().filter(emp->emp.getDepartment().equalsIgnoreCase("Product Development")).map(emp-> emp).collect(Collectors.toList());
        System.out.println(names);
        Map<String, Long> map=listEmployees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(map);



    }



}
