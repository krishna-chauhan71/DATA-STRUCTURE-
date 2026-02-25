// package PATTERN_PRINTING;

import java.util.Scanner;

public class pyramid2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1, nst = 1;  //nsp= no. of space print and nst= no. of star print
        for (int i=1; i<=n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }
    }
}
