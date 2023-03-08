import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String ans="",str = sc.nextLine();
		for (int i = str.length()-1; i >= 0 ; i--) {
			char ch = str.charAt(i);
			ans +=ch;
		}
		System.out.println("Reversed String is "+ans);
//		for (int i=0; i<str.length(); i++)
//		{
//			char ch= str.charAt(i); //extracts each character
//			ans1= ch+ans1; //adds each character in front of the existing string
//		}
//		System.out.println("Reversed String is "+ans1);
		if(ans.equals(str)) {
			System.out.println("A pallindrome");
		}else
		{
			System.out.println("Not A pallindrome");
		}
		sc.close();
		
	}

}
