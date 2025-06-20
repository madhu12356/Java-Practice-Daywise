    package com;

   import java.util.*;
   import static java.util.stream.Collectors.*;

    public class StudentProcessor {
    public static void main(String[] args) {
        List<Student> students = StudentDatabase.getAllStudents();

        System.out.println("  All Students:");
        students.forEach(System.out::println);

        // Filter students with score > 80
        System.out.println("\n  Students with score > 80:");
        students.stream()
                .filter(s -> s.getScore() > 80)
                .forEach(System.out::println);

        // Map to names
        System.out.println("\n  Student Names:");
        students.stream()
                .map(Student::getName)
                .distinct()
                .forEach(System.out::println);

        // Sorted by score
        System.out.println("\n  Students Sorted by Score:");
        students.stream()
                .sorted(Comparator.comparingDouble(Student::getScore))
                .forEach(System.out::println);

        // Skip 1 and limit 2
        System.out.println("\n  Skip 1, Limit 2:");
        students.stream()
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

        // Count students over 21
        long count = students.stream()
                .filter(s -> s.getAge() > 21)
                .count();
        System.out.println("\n  Count of students older than 21: " + count);

        // Summary statistics
        DoubleSummaryStatistics stats = students.stream()
                .collect(summarizingDouble(Student::getScore));
        System.out.println("\n  Score Stats:");
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Avg: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());

        // Convert to Map (id -> name)
        Map<Integer, String> idNameMap = students.stream()
                .collect(toMap(Student::getId, Student::getName, (a, b) -> a));
        System.out.println("\n  ID to Name Map:");
        idNameMap.forEach((k, v) -> System.out.println(k + " => " + v));

        // Group by Score
        Map<Double, List<Student>> groupByScore = students.stream()
                .collect(groupingBy(Student::getScore));
        System.out.println("\n  Grouped by Score:");
        groupByScore.forEach((score, list) -> {
            System.out.println("Score: " + score);
            list.forEach(System.out::println);
        });

        // Updated flatMap example – Print each name and characters line by line
        System.out.println("\n  All student names in one line:");
        String namesLine = students.stream()
                .map(Student::getName)
                .distinct()
                .collect(joining(" "));
        System.out.println(namesLine);
                   }
         }