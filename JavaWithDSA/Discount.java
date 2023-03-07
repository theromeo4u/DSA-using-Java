import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter price of product: ");
		double price = sc.nextDouble();
		System.out.print("Enter discount in % : ");
		double dis = sc.nextDouble();
		double disAmt = (dis/100)*price;
		System.out.println(disAmt);
		System.out.println("Final price of product is: "+ String.format("%.2f",price-disAmt));

	}

}
