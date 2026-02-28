package DSA_METHOD;
import java.util.Scanner;
public class max_of_three_no_using_math_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        System.out.println("The max.. number is:");
//        System.out.println(Math.max(Math.max(a,b),c));  //to find the maximum of three number..
//        System.out.println("The min.. number is:");
//        System.out.println(Math.min(Math.min(a,b),c));

        // 4 number ka max.. number
        int d = sc.nextInt();
        System.out.println(Math.max(Math.max(Math.max(a,b),c),d));
    }
}
