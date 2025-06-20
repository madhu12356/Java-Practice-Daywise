     package com;

       import java.util.Arrays;
       import java.util.List;

        public class StudentDatabase {
        public static List<Student> getAllStudents() {
            return Arrays.asList(
                new Student(1, "Sam", 22, 85.5),
                new Student(2, "Roja", 21, 90.0),
                new Student(3, "Anjali", 23, 70.2),
                new Student(4, "Amrutha", 22, 90.0),
                new Student(5, "vijaya", 22, 85.5)
                );
             }
          }