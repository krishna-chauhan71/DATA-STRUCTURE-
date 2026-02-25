// package PATTERN_PRINTING;

import java.util.Scanner;

public class Number_triangle_vertically_flipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
//            for (int j=1; j<=n; j++){
//                if (i+j==6){
//                    System.out.print("1 ");
//            } else if (i+j==7) {
//                    System.out.print("2 ");
//                } else if (i+j==8) {
//                    System.out.print("3 ");
//                } else if (i+j==9) {
//                    System.out.print("4 ");
//                } else if (i+j>=10) {
//                    System.out.println("5 ");
//                }
//            }
//            System.out.println();
            //     }
//            ORR

        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
  }
}


