package src.Product3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        Product3[] vect = new Product3[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Enter product name: ");
            String name = sc.nextLine();
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            vect[i] = new Product3(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;
        System.out.printf("Average price = %.2f%n", avg);
        sc.close();
    }
}
