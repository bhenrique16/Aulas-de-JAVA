package src.Exercicios;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Digite um numero: ");
        num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("PAR");
        }
        else{
            System.out.println("Impar");
        }
        sc.close();
    }
}