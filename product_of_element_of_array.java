package Array;

import java.util.Scanner;

public class product_of_element_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int product = 1;
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[]arr= new int[n];
        System.out.println("Enter the elements of array:");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
            product *= arr[i];
        }
        System.out.print("The product of give array is:" +product);
    }
}
