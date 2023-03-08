import java.util.Scanner;

public class ProductOfNum {
	static void productOfNumber(int num1, int num2) {
		System.out.println("Product of "+num1+"x" +num2+" is "+num1*num2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter number 2: ");
		int num2 = sc.nextInt();
		productOfNumber(num1, num2);

	}

}
