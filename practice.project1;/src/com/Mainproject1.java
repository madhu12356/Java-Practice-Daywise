package com;

public class Mainproject1 {
		    public static void main(String[] args) {
	        int[] marks1 = {80, 90, 70}; // student 1
	        Student s1 = new Student("Ravi", 101, marks1);
	        s1.generateReport();

	        int[] marks2 = {30, 25, 20}; // student 2
	        Student s2 = new Student("Priya", 102, marks2);
	        s2.generateReport();
	    }
	}

