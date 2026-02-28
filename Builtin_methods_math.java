package DSA_METHOD;

import java.util.Scanner;

public class Builtin_methods_math {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // Math. wale
        System.out.println(Math.sqrt(10)); //to find the square of any number
        System.out.println(Math.sqrt(9.8));
        System.out.println(Math.cbrt(125));  //to find the cuberoot of any number
        System.out.println(Math.abs(48));   //to find the absolute value of any no.
        System.out.println(Math.abs(-65));
        System.out.println(Math.floor(7.8)); // To find the greatest integer function
        System.out.println(Math.floor(-7.8));
        System.out.println(Math.ceil(3.0001));  // to find the silling value between the two number
        System.out.println(Math.min(5,9)); // To find the minimum value between two number
        System.out.println(Math.max(5,9)); // To find the maximum value between two number

        System.out.println(Math.pow(4,5));
//        int n = 4*4*4*4*4;
//        System.out.println(n);
        System.out.println(Math.pow(0,0));
    }
}
