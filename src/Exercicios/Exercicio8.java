package src.Exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        double A,B,C;
        double triangulo,circulo,trapezio,quadrado,retangulo;
        double pi = 3.14159;

        Scanner sc = new Scanner(System.in);

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = (A * C) / 2;
        circulo = pi * (C * C);
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("TRIANGULO :%.3f%n",triangulo);
        System.out.printf("CIRCULO :%.3f%n",circulo);
        System.out.printf("TRAPEZIO :%.3f%n",trapezio);
        System.out.printf("QUADRADO :%.3f%n",quadrado);
        System.out.printf("RETANGULO :%.3f%n",retangulo);

        sc.close();
    }
}
