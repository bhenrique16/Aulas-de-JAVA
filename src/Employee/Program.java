package src.Employee;



import java.util.Locale;

import java.util.Scanner;



public class Program{

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.printf("Name : ");
        emp.name = sc.nextLine();
        System.out.printf("Gross Salary : ");
        emp.grossSalary = sc.nextDouble();
        System.out.printf("Tax :");
        emp.tax = sc.nextDouble();




        System.out.printf("Employee: %s, Net Salary: %.2f", emp.name, emp.netSalary());
        System.out.println();
        System.out.printf("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.printf("Updated data: %s, %.2f%n", emp.name, emp.netSalary());



        sc.close();

    }

}
