import java.util.Scanner;

public class Pythagorean {
	static void pythagorean(double base, double height, double diag) {
		if((base*base)+(height*height) == diag*diag){
			System.out.println("Pythagorean Tripplet");
		}else
			System.out.println("Not Pythagorean Tripplet");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		double num1 = sc.nextInt();
		System.out.print("Enter number 2: ");
		double num2 = sc.nextInt();
		System.out.print("Enter number 3: ");
		double num3 = sc.nextInt();
		pythagorean(num1, num2, num3);
	}

}
