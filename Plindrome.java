import java.util.Scanner;

public class Plindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check palindrome: ");
		int num = sc.nextInt();
		int orgnum=num,rev=0;
		while(num>0) {
			//orgnum = num;
			int rem = num%10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		
		if(rev == orgnum) {
			System.out.println("Palindrome");
		}else{
			System.out.println("Not a Pallindrome");
		}
		
	}

}
