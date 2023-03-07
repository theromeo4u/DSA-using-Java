import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		System.out.print("Enter the digit to count : ");
		int digit = sc.nextInt();
		int cnt=0;
		while(num>0)
		{
			int rem = num % 10;
			if(rem==digit) {
				cnt++;
			}
			num/=10;
		}
		System.out.print("The digit "+digit + " is present "+cnt+ " Times");
	}

}
