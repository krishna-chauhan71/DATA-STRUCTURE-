package Array;

import java.util.Scanner;

public class output_input_array {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
//        int[] arr = {3, 44, 78, 65, -45};
//        int n =arr.length;
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        int[] karan = new int[7];
////        for (int i=0; i<7; i++){
////            System.out.print(karan[i]+" ");
////        }
//
//
//        //input by users in arary
//       for (int i=0; i<7; i++){
//           karan[i] = sc.nextInt();
//       }
//       // print
//       for (int i=0; i<7; i++){
//           System.out.print(karan[i]+" ");

           int[] karan = new int[7];

           for (int i=0; i<7; i++){
               karan[i] = sc.nextInt();
               System.out.print(2*karan[i]+" ");  // multiplicatin of 2 in given array

           }
       }
    }

