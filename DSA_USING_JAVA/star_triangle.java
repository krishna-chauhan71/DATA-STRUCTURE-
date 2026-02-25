// package PATTERN_PRINTING;
import java.util.Scanner;
public class star_triangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Example no. 01
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Example no. 02
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//    }

        //Example no. 03
//        for(int i=1; i<=n; i++){
//            for (int j=1; j<=i; j++ ){
//                System.out.print((char)(j+64)+" ");
//            }
//            System.out.println();
//        }
        //Example no. 04
//        for(int i=1; i<=n; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print((char)(i+64)+" ");
//            }
//            System.out.println();
//        }
        //Example no. 05 nhi aa raha hai
        // Example no. 06

//        for (int i=1; i<=n; i++){
//            for (int j=n; j>=i;j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        OR STANDARD TARIKA HAI
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=n+1-i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        // Example no. 7
//        for (int i=1; i<=n; i++){
//            for(int j=1; j<=n+1-i; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        //Example no. 8
//        for (int i=1; i<=n; i++){
//            for(int j=1; j<=n+1-i; j++){
//                System.out.print((char)(j+96)+" ");
//            }
//            System.out.println();
//        }

        //Example no. 9
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
    }
//}





