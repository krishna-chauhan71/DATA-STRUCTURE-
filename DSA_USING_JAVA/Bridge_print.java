package DSA_USING_JAVA;
// package PATTERN_PRINTING;
import java.util.Scanner;

public class Bridge_print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // you can also take input

        int nsp = 0;

        for (int i = 1; i<=n; i++) {

            // Left stars with gap
            for (int j = 1; j <=n+i-1; j++) {
                System.out.print("* ");
            }

            // Middle spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");   // double space for proper alignment
            }

            // Right stars with gap
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
            nsp += 2;
        }

        sc.close();
    }
}
