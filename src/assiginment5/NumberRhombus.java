package assiginment5;
import java.util.Scanner;

public class NumberRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for number of rows (half of the rhombus)
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Upper half including middle row
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // Print decreasing numbers
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // Print decreasing numbers
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }

            System.out.println();
        }

        scanner.close();
    }
}


