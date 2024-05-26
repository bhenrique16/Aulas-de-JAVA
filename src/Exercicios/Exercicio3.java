package src.Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int A, B, soma;

        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();


        soma = A + B;

        System.out.println("Soma = " + soma);

        sc.close();
    }

}
