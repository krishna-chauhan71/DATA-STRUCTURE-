package DSA_METHOD;
import java.util.Scanner;
public class permutation_and_combination {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int r = sc.nextInt();
//
//         int nfact = 1;
//         for (int i=1; i<=n; i++) {
//             nfact *= i;
//         }
//         int rfact = 1;
//         for (int i=1; i<=r; i++){
//             rfact *=i;
//         }
//         int NminusRfact = 1;
//         for (int i=1; i<=n-r; i++){
//          NminusRfact *=i;
//
//         }
//         int ncr = nfact/(rfact*NminusRfact);
//         System.out.println(ncr);

    //by using method
    public static int fact(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int r = sc.nextInt();

   int ncr = fact(n)/(fact(r)*fact(n-r));
   int npr = fact(n)/fact(n-r);
       System.out.println(ncr);
       System.out.println(npr);
    }
}
