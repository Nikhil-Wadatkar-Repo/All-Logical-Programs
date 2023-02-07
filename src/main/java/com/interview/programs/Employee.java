package com.interview.programs;

import java.util.Arrays;
import java.util.List;

public class Employee {
	private int id;
	private int deptEmpId;
	private String name;

	public Employee(int id, int deptEmpId, String name) {
		super();
		this.id = id;
		this.deptEmpId = deptEmpId;
		this.name = name;
	}

	public int getDeptEmpId() {
		return deptEmpId;
	}

	public void setDeptEmpId(int deptEmpId) {
		this.deptEmpId = deptEmpId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	static public List<Employee> employees() {

		return Arrays.asList(new Employee(1, 1, "1"), new Employee(2, 2, "2"), new Employee(3, 3, "3"),
				new Employee(4, 4, "4"), new Employee(5, 5, "5"), new Employee(6, 6, "nana"), new Employee(7, 7, "7"),
				new Employee(8, 8, "8"), new Employee(9, 9, "9"), new Employee(10, 10, "10"));
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", deptEmpId=" + deptEmpId + ", name=" + name + "]";
	}

}
