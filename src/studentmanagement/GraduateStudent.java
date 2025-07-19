package studentmanagement;

public class GraduateStudent extends Student implements PersonInfo {
    String thesisTopic;

    public GraduateStudent(int id, String name, int age, int grade, String thesisTopic) {
        super(id, name, age, grade);
        this.thesisTopic = thesisTopic;
    }

    @Override
    public String getDetails() {
        return String.format(
                "Graduate student info: id = %s, name = %s, age = %s, grade = %s, thesis topic = %s",
                id, name, age, grade, thesisTopic
        );
    }
}