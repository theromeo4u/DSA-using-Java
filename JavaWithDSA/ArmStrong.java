import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check Armstrong number : ");
		int num = sc.nextInt();
		boolean ans = Armstrong(num);
		System.out.println("The number is Amstrong: "+ans);
		System.out.print("All three digit Armstrong numbers are : ");
		for (int i = 100; i < 1000; i++) {
			if(Armstrong(i)) {
				System.out.print(i + " ");
			}
		}

	}

	static boolean Armstrong(int num) {
		int rem=0,sum=0,org=num;
		while(num>0) {
			rem = num%10;
			num /= 10;
			sum = sum + (rem*rem*rem);
			
		}
		if(sum == org)
			return true;
			
		return false;
			
		
	}

}
