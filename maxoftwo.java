package DSA_METHOD;

public class maxoftwo {
    public static int maxofthree(int a, int b, int c){  //parameter
        if (a>=b && a>=c)
            return a;
        else if (b>=a && b>=c)
            return b;
        else
            return c;
    }
    public static void main(String[] args) {
        System.out.println(maxofthree(8, 9, 10));
    }
}
