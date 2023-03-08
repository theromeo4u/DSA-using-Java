
import java.util.*;
public class ProductOfTwoNumber {
    public static int Multiply(int num1, int num2) {
        int mul = num1*num2;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n = sc.nextInt();
        System.out.print("Enter number 2: ");
        int m = sc.nextInt();

        System.out.println("Multiplication of "+n +" * "+m +" is: "+ Multiply(n,m));

        sc.close();  }
}

