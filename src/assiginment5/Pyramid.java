package assiginment5;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();


        for (int i = 1; i <= n; i++) {
            // Print spaces to center-align the numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }


            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }


            System.out.println();
        }

        scanner.close();
    }
}

