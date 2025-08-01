package assiginment5;
import java.util.Scanner;

public class CharacterRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for number of rows (half of rhombus)
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Upper half including middle
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print characters in ascending order
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }

            // Print characters in descending order
            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch);
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print characters in ascending order
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }

            // Print characters in descending order
            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch);
            }

            System.out.println();
        }

        scanner.close();
    }
}


