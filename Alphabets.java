import java.util.Scanner;

public class Alphabets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		char ch;int vovels=0,constt=0;
		String vovel="",cons="";
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I'||
			   ch == 'O'|| ch == 'U') {
				vovels++;
				vovel += ch;
			}
			else {
				constt++;
				cons += ch;
			}
		}
		System.out.println(vovels+" vovels and "+constt+" consonents ");
		System.out.println(vovel+" are vovels and "+cons+" are consonents ");

	}

}
