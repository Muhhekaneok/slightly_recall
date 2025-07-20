package studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Donald", 21, 74));
        studentList.add(new Student(2, "Joe", 23, 86));
        studentList.add(new Student(3, "Emmanuel", 18, 82));
        studentList.add(new GraduateStudent(4, "Angela", 20, 85, "Spinning Dictators"));

        System.out.println("Students older than 20: ");
        studentList.stream()
                .filter(s -> s.age > 20)
                .forEach(s -> System.out.println(s.getDetails()));


        System.out.println("\nStudents sorted by grade (descending):");
        studentList.stream()
                .sorted((s1, s2) -> Integer.compare(s2.grade, s1.grade))
                .forEach(s -> System.out.println(s.getDetails()));


        System.out.printf("\nAverage grade of all student: %.2f",
                studentList.stream()
                        .mapToInt(s -> s.grade)
                        .average()
                        .orElse(0)
        );
    }
}