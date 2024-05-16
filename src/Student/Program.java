package src.Student;

import java.util.Locale;

import java.util.Scanner;


public class Program{

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();


        student.name = sc.nextLine();
        student.gradeA = sc.nextDouble();
        student.gradeB = sc.nextDouble();
        student.gradeC = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.1f%n", student.finalGrade());
        if(student.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("Missing %.2f points",student.passORnot());

        }else{
            System.out.println("PASS");
        }


        sc.close();
    }

}
