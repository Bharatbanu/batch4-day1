package assiginment5;
import java.util.Scanner;

public class SumOddNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            long sum = (long) n * n;
            System.out.printf("Sum of first %d odd natural numbers = %d%n", n, sum);
        }
        sc.close();
    }
}


