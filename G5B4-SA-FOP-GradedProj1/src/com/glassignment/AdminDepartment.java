package com.glassignment;

public class AdminDepartment extends SuperDepartment {

	public AdminDepartment(String departname, String todaysWork, String workDeadline) {
		super(departname, todaysWork, workDeadline);
		// TODO Auto-generated constructor stub
	}

	public String departmentName() {
		return departname;
	}

	public String getTodaysWork() {
		return todaysWork;

	}

	public String getWorksDeadline() {
		return workDeadline;
	}

}
