package src.Exercicios;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;


        System.out.println("digite um numero : ");
        numero = sc.nextInt();

        if(numero <= 0){
            System.out.println("NEGATIVO");
        }else {
            System.out.println("NAO NEGATIVO");
        }

        sc.close();


    }
}
