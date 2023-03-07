import java.util.Scanner;

public class Swapp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1 + " " + num2);
		swap(num1,num2);

	}

	 static void swap(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println(num1 + " " + num2);
		
	}

}
