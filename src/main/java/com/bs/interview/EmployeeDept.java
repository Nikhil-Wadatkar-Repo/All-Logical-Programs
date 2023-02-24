package com.bs.interview;

import java.util.Arrays;
import java.util.List;

public class EmployeeDept {
	private int id;
	private int deptEmpId;
	private String name;

	public EmployeeDept(int id, int deptEmpId, String name) {
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

	static public List<EmployeeDept> employees() {

		return Arrays.asList(new EmployeeDept(1, 1, "1"), new EmployeeDept(2, 2, "2"), new EmployeeDept(3, 3, "3"),
				new EmployeeDept(4, 4, "4"), new EmployeeDept(5, 5, "5"), new EmployeeDept(6, 6, "nana"), new EmployeeDept(7, 7, "7"),
				new EmployeeDept(8, 8, "8"), new EmployeeDept(9, 9, "9"), new EmployeeDept(10, 10, "10"));
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", deptEmpId=" + deptEmpId + ", name=" + name + "]";
	}

}
