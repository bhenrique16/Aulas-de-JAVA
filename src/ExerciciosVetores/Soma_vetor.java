package src.ExerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma,media;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] vetor = new double[n];

        for(int i=0;i<n;i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        soma = 0;

        for(int i=0;i<n;i++){
            soma = soma + vetor[i];
        }

        media = soma / n;

        System.out.printf("VALORES= ");

        for(int i=0;i<n;i++){
            System.out.printf("%.2f ", vetor[i]);

        }

        System.out.printf("\nSoma= %.2f\n", soma);
        System.out.printf("Media= %.2f\n", media);


        sc.close();
    }
}
