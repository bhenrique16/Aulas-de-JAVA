package src.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();

        String[] names = new String[n];
        String[] email = new String[n];
        Integer[] room = new Integer[n];


        for (int i = 0; i < n; i++) {
            System.out.printf("Rent #%d:%n", i + 1);
            System.out.print("Nome: ");
            names[i] = sc.next();
            System.out.print("Email: ");
            email[i] = sc.next();
            System.out.print("Room: ");
            room[i] = sc.nextInt();
        }

        System.out.println("\nRented rooms:");
        for (int i = 0; i < n; i++) {
            if (room[i] != null) {
                System.out.printf("Rent #%d: Room %d, Nome: %s, Email: %s%n", i + 1, room[i], names[i], email[i]);
            }
        }





        sc.close();
    }
}

