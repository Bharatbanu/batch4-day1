package assiginment5;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("sum is "+sum +" avg is "+(sum/n));
        
    }
}

