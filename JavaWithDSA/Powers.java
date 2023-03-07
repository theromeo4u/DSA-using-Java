import java.util.Scanner;

public class Powers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base: ");
		int base = sc.nextInt();
		System.out.print("Enter pow: ");
		int power = sc.nextInt();
		//int ans = (int) Math.pow(base, power);
		int ans = base^power;
		System.out.println(ans);

	}

}
