package com.glassignment;

public class Main {

	public static void main(String[] args) {

		SuperDepartment sDepart = new SuperDepartment("Super Department", "No work as of now", "Nil",
				"Today is not a Holiday");
		AdminDepartment aDepart = new AdminDepartment("Admin Deapartment", "Complete your documents submission",
				"Complete by EOD");
		HrDepartment hDepart = new HrDepartment("HR Department", "Fill today's timesheet and mark your attendence",
				"Complete by EOD", "team Lunch");
		TechDepartment tDepart = new TechDepartment("Tech Department", "Complete coding of Module 1", "Complete by EOD",
				"Core Java");

		// Superdepartment method calling
		// System.out.println("Department name is: "+ sDepart.departmentName());
		// System.out.println("Work of Department for today is:"+
		// sDepart.getTodaysWork());
		// System.out.println("The Deadline is:"+ sDepart.getWorksDeadline());
		// System.out.println("Department Holiday:"+ sDepart.getTodaysAHoliday());

		System.out.println();

		// Admin method calling

		// System.out.println("Department name is: "+ aDepart.departmentName());
		System.out.println("Welcome to " + aDepart.departmentName());
		// System.out.println("Work of Department for today is:"+
		// aDepart.getTodaysWork());
		System.out.println(aDepart.getTodaysWork());
		// System.out.println("The Deadline is:"+ aDepart.getWorksDeadline());
		System.out.println(aDepart.getWorksDeadline());
		// System.out.println("Department Holiday:"+ sDepart.getTodaysAHoliday());
		System.out.println(sDepart.getTodaysAHoliday());

		System.out.println();

		// Hr method calling

		System.out.println("Welcome to " + hDepart.departmentName());
		System.out.println(hDepart.doActivity());
		System.out.println(hDepart.getTodaysWork());
		System.out.println(hDepart.getWorksDeadline());
		// System.out.println("Activity to be performed:"+ hDepart.doActivity());
		System.out.println(sDepart.getTodaysAHoliday());

		System.out.println();

		// Tech method calling

		System.out.println("Welcome to " + tDepart.departmentName());
		System.out.println(tDepart.getTodaysWork());
		System.out.println(tDepart.getWorksDeadline());
		System.out.println(tDepart.techInformation);
		System.out.println(sDepart.getTodaysAHoliday());

		System.out.println();

	}

}
