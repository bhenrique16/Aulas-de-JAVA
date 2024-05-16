package src.Student;

public class Student {
    String name;
    double gradeA;
    double gradeB;
    double gradeC;

    public double finalGrade() {
        return gradeA + gradeB + gradeC;
    }

    public double passORnot() {

        if(finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }
}
