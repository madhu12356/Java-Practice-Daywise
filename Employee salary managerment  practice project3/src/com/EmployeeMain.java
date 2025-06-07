package com;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e1 = new Employee("Arjun", 1001, 25000);
		Employee e2 = new Employee("Meena", 1002, 30000);

		e1.generatePayslip();
		e2.generatePayslip();
	}
}