import java.util.Scanner;

public class MaxAndMinNumber {
	static void MaxNumber(int num1, int num2, int num3) {
		if(num1 >= num2 && num1>=num3) {
			System.out.println("Largest number: "+num1);
		}else if(num2>=num3) {
			System.out.println("Largest number: "+num2);
		}else {
			System.out.println("Largest number: "+num3);
		}
	}
	
	static void MinNumber(int num1, int num2, int num3) {
		if(num1 <= num2 && num1<=num3) {
			System.out.println("Smallest number: "+num1);
		}else if(num2<=num3) {
			System.out.println("Smallest number: "+num2);
		}else {
			System.out.println("Smallest number: "+num3);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter number 2: ");
		int num2 = sc.nextInt();
		System.out.print("Enter number 3: ");
		int num3 = sc.nextInt();
		MaxNumber(num1, num2, num3);
		MinNumber(num1, num2, num3);

	}

}
