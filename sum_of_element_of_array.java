package Array;

import java.util.Scanner;

public class sum_of_element_of_array {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array:");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
            sum += arr[i];
        }
        System.out.println("The sum of array is:"+sum);
    }
}
