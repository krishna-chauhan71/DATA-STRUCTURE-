package IF_ELSE_JAVA_02;
import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      /*  System.out.println("Enter the value to check number is odd or even");
        int n = sc.nextInt();
        if (n%2==0)
            System.out.println("The number is even: ");
        else {
            System.out.println("The number is odd: ");
        }
        */
//        System.out.println("Enter the number to check to divisible by 5 or not");
//        int n = sc.nextInt();
//        if (n%5==0)
//            System.out.println("The number is divisible by 5: ");
//        else {
//            System.out.println("The number is not divisible by 5: ");
//        }


        //to find the absolute value
//        System.out.println("enter the value to find absolute number: ");
//        int n = sc.nextInt();
//        if(n>=0)
//            System.out.println(n);
//        else {
//            System.out.println(-n);
//        }

//        System.out.println("Enter a number: ");
//        double n = sc.nextDouble(); //46.56
//        int x = (int)n;  // type casting hua hai jo bhi decimal ke baad ka value rahega usko neglate kar dega kyo kii int ka use hua hia
//        if(n-x == 0)   // double value me se integer value ko subtract kar rahe hai yadi 0 ke equal hua to interger value milega nhi to nahi
//            System.out.println("Is an integer: ");
//        else
//            System.out.println("Not an integer: ");


        //to find profit or loss
//        System.out.println("Enter the cost price: ");
//        int cp = sc.nextInt();
//        System.out.println("Enter the selling price: ");
//        int sp = sc.nextInt();
//        if(cp<sp)
//            System.out.println("PROFIT  "+(sp-cp)+  " rupees");
//        else if (cp==sp) {
//            System.out.println("Nither profit nor loss");
//        }
//        else {
//            System.out.println("LOSS "+ (cp-sp)+ "  rupees");
//        }
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("Riya");
        }
        System.out.println("Enter the number");
        int p = sc.nextInt();
         if (p%3==0) {
            System.out.println("Nandini");
        }
        else if (n%5==0 && p%3==0) {
            System.out.println("Arti");
        } else if (n%5!=0 && p%3!=0) {
            System.out.println("Nikhil");
        }


    }
}
