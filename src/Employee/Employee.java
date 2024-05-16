package src.Employee;



public class Employee {
    public String name;
    public Double grossSalary;
    public Double tax;

    public double netSalary(){
        return grossSalary - tax;

    }

    public void increaseSalary(double percentage){
        grossSalary += grossSalary * percentage / 100.0;
    }

}