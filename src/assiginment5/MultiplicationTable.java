package assiginment5;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        System.out.print("Enter maximum multiplier: ");
        int max = in.nextInt();

        System.out.println("\nMultiplication Table of " + number);
        for (int i = 1; i <= max; i++) {
            System.out.printf("%d * %d = %d%n", number, i, number * i);
        }
        in.close();
    }
}



