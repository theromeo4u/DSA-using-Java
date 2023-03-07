import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			ans = str.charAt(i) + ans;
		}
		System.out.println("Original String : "+str);
		System.out.println("Reversed String : "+ans);

	}

}
