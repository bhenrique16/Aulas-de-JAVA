package src.Calculator;


public class Calculator {

    public static double PI = 3.14159;

    public static double circuference(double radius){
        return 2.0 * PI * radius;
    }
    public static double volume(double radius){
        return 2.0 * PI * radius * radius * radius / 3.0;
    }
}