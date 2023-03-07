import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many units are consumed by the user: ");
		int unit = sc.nextInt();
		System.out.print("Enter rate per unit: ");
		double rate = sc.nextDouble();
		double bill = unit*rate;
		System.out.println("Total bill have to pay by Customer id : "+ String.format("%.2f", bill));

	}

}
