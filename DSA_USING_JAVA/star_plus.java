// package PATTERN_PRINTING;

import java.util.Scanner;

public class star_plus {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i=1; i<=n;i++){
            for (int j=1; j<=n; j++){
//                System.out.print("* ");
                if(i==3 || j==3){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
