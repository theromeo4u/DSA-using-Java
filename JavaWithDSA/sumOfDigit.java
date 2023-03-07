import java.util.Scanner;

public class sumOfDigit {
    int sum=0;
	public int sumOfDigits(int number){
	    for (sum = 0; number > 0;)
		{
			sum = sum + number % 10;
			number = number / 10;
		}

	    return sum;
	}
	public static void main(String args[]) {
	    int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to be addition: ");
		num = sc.nextInt();
		sumOfDigit val = new sumOfDigit();
		System.out.println(val.sumOfDigits(num));
		sc.close();
	}
}
