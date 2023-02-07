package com.interview.programs;

import java.util.Arrays;
import java.util.List;

public class Dept {
	private int deptId;
	private boolean status;

	public Dept(int deptId, boolean status) {
		super();
		this.deptId = deptId;
		this.status = status;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", status=" + status + "]";
	}

	static public List<Dept> departments() {

		return Arrays.asList(new Dept(1, false), new Dept(2, true), new Dept(3, false), new Dept(4, true),
				new Dept(5, false), new Dept(6, true), new Dept(7, false), new Dept(8, true), new Dept(9, false),
				new Dept(10, true));
	}

}
