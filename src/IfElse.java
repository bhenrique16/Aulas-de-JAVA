package src;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int minutos = sc.nextInt();
        double conta = 50.0;

        if(minutos > 100){
            conta = conta + (minutos - 100) * 2.0;

        }
        System.out.printf("Valor da conta = %.2f%n",conta);
    }
}
