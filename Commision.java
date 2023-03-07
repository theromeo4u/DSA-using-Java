import java.util.Scanner;

public class Commision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Price: ");
		double price = sc.nextDouble();
		System.out.print("Enter your commision in % : ");
		double rate = sc.nextDouble();
		int com = ((int)((rate/100)*price));
		System.out.println("Your Commision is : "+com);
	}

}
