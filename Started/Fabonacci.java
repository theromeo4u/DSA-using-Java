import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number for Fabonacci number: ");
		int n = sc.nextInt();
		int ans=0,a=0,b=1;
		for (int i = 0; i < n; i++) {
			ans = a + b;
			a=b;
			b=ans;
		}
		System.out.println(ans-b+a);
		System.out.println("Ans is : " +a);
		sc.close();
	}

}
