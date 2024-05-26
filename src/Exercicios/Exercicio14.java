package src.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double valor;
        Scanner sc = new Scanner(System.in);

        valor = sc.nextDouble();

        if(valor < 0 || valor > 100){
            System.out.println("Fora do intervalo");
        }
        else if(valor <= 25.0 ){
            System.out.println("Intervalo [0,25]");
        }
        else if(valor <= 50.0){
            System.out.println("Intervalor [25,50]");
        }
        else if(valor <= 75.0 ){
            System.out.println("Intervalor [50,75]");
        }

        else {
            System.out.println("Intervalor [75,100]");
        }

        sc.close();
    }
}
