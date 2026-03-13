package Array;

import java.util.Scanner;

public class print_negative_value_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int []arr= new int[n];
        System.out.println("Enter the array element:");
        for (int i=0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Neagative element:");
        for (int i=0; i<n; i++) {
            if (arr[i]<0){
                System.out.println(arr[i]+" ");
            }
        }
    }
}

