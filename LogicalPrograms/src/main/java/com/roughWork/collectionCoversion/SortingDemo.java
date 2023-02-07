package com.roughWork.collectionCoversion;

import com.bs.rough.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingDemo {
        public static void main(String[] args) {
        List<Employee> emps=Employee.getEmployees();
//
//        Collections.sort(emps);
//        //sorting
        emps.stream().sorted(Comparator.comparing(Employee::getName)).map(emp->emp.getName()+" "+emp.getAge()).forEach(System.out::println);
    }


}
