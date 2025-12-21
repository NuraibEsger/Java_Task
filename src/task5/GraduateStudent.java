package task5;

public class GraduateStudent extends Student {
    private double bonus;

    public GraduateStudent(String name, double grade, double bonus) {
        super(name, grade);
        this.bonus = bonus;
    }

    @Override
    public double getFinalGrade() {
        return grade + bonus;
    }
}
