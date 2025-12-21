package task5;

public class Student {
    protected String name;
    protected double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public double getFinalGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }
}
