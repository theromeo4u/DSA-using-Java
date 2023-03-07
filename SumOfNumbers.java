import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String input = 0;
		int sum = 0,num=0;
//		while(num != 0) {
//			System.out.print("Enter a number or Enter 0 to quit : ");
//			num = sc.nextInt();
//			sum += num;
//			
//		}
		do {
			System.out.print("Enter a number or Enter 0 to quit : ");
			num = sc.nextInt();
			sum += num;
			
		}while(num != 0);
		System.out.println("The sum of entered number is : "+sum);
		
	}

}
