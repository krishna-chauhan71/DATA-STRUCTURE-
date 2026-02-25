package PATTERN_PRINTING;
import java.util.Scanner;
public class  HOLLOW_RECTANGLE {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        //Example 01
        for (int i=1; i<=m; i++){
            for (int j=1; j<=n; j++){
                if(i==1 || i==m || j==1 || j==n){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
