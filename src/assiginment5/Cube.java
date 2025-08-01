package assiginment5;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n ;i++){
            System.out.println("The number is "  + i  + "cube is " +(i*i*i));
        }
    }
}
