package src.exercicios;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();



        if(A % B == 0 || B % A == 0){
            System.out.println("sao multiplos");
        }
        else{
            System.out.println("nao são multiplos");
        }
        sc.close();
    }
}
