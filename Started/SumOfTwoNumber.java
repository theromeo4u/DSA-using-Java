import java.util.*;
public class SumOfTwoNumber {
    public static void Sum(int num1, int num2) {
        System.out.println("Sum of "+num1 +" + "+num2 +" is: "+(num1+num2));
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n = sc.nextInt();
        System.out.print("Enter number 2: ");
        int m = sc.nextInt();

        Sum(n, m);
        sc.close();
    }
}
