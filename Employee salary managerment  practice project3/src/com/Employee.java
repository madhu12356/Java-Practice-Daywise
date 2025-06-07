package com;

public class Employee {
	static String companyName = "Nirmaan Technologies"; // Static variable
	static double bonusPercentage;

	final double maxLeave = 30; // Final variable

	String empName;
	int empId;
	double salary;

	// Static block
	static {
		System.out.println("=== Welcome to " + companyName + " ===");
		bonusPercentage = 10.0;
	}

	// Constructor
	public Employee(String empName, int empId, double salary) {
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
	}

	public void generatePayslip() {
		double bonus = (salary * bonusPercentage) / 100; // Local variable
		double totalPay = salary + bonus;

		System.out.println("Employee: " + empName + " | ID: " + empId);
		System.out.println("Base Salary: ₹" + salary);
		System.out.println("Bonus: ₹" + bonus);
		System.out.println("Total Pay: ₹" + totalPay);
		System.out.println("------------------------------");
	}
}
