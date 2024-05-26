package src.Exercicios;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero,horas;
        double salario;

        numero = sc.nextInt();
        horas = sc.nextInt();

        salario = numero * horas;

        System.out.println("Number = " + numero);
        System.out.println(horas);
        System.out.printf("Salary = %.2f%n",salario);

    }
}
