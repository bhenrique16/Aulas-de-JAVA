package src.exercicios;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        int horaInicial,horaFinal,duracao;


        Scanner sc = new Scanner(System.in);

        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        duracao =horaFinal - horaInicial;

        if(horaInicial > horaFinal ){
            duracao = horaInicial - horaFinal ;

        }
        System.out.printf("O jogo durou %d Horas",duracao);
        sc.close();
    }
}
