package com.bs.programs;

import java.util.List;
import java.util.stream.Collectors;

public class Test06_ComparingTwoListUsingStreams {

    public static void main(String[] args) {
        List<EmployeeDept> employees = EmployeeDept.employees();
        List<Dept> depts = Dept.departments();


        // comparing using for loop
//		employees.forEach((emp) -> {
//			depts.forEach((dept) -> {
//				if (dept.isStatus() && emp.getId() == dept.getDeptId())
//					System.out.println(emp);
//			});
//		});

        List<EmployeeDept> filteredList = employees.stream()
                .filter(emp -> (depts.stream()
                        .filter(dept -> (dept.isStatus() && dept.getDeptId() == emp.getDeptEmpId())).count() > 1))
                .collect(Collectors.toList());
        System.out.println(filteredList);
    }

}
