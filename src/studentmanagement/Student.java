package studentmanagement;

public class Student implements PersonInfo {
    int id;
    String name;
    int age;
    int grade;

    public Student(int id, String name, int age, int grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String getDetails() {
        return String.format(
                "Student info: id = %s, name = %s, age = %s, grade = %s",
                id, name, age, grade
        );
    }
}