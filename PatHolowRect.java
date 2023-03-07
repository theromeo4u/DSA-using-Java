import java.util.*;
public class PatHolowRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows");
        int n = sc.nextInt();
        System.out.println("Enter Rows");
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n;j++) {
                if(i==0 || i==m-1 || j==0 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }sc.close();
    }
}
