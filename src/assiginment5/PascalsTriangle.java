package assiginment5;

import java.util.Scanner;

public class PascalsTriangle {

    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    static int binomialCoeff(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();


        for (int i = 0; i < rows; i++) {
            // Print spaces for formatting
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }


            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoeff(i, j) + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}

