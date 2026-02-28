package DSA_METHOD;

public class Argument {
    public static void sum(int a, int b , int c) {  //parameters
//        System.out.println(a+b);
//    }
//    public static void main(String[] args){
//        sum(8,7);  //arguments

        //max between three number
        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else
            System.out.println(c);
    }
    public static void main(String[] args){
        sum(46,44,87);

    }
}
