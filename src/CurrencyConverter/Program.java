package src.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;
import entities.CurrencyConverter;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("What is the dollar price?");
        converter.dolarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        converter.dolarQuantity = sc.nextDouble();

        double convesao = converter.Conversor();
        System.out.printf("Amount to be paid in reais: %.2f%n", convesao);


        sc.close();
    }
}

