import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        boolean count = true;
        int n = sc.nextInt();
        if (n == 0 || n == 1) {
            count = false;
        } else {
            for (int i = 2; i <= n/2; ++i) {
                if (n % i == 0) {
                    count = false;
                    break;
                }
            }
        }
        if (count) {
            System.out.println("Its a Prime Number");
        } else {
            System.out.println("Not a Prime Number");

        }
        sc.close(); }
}
