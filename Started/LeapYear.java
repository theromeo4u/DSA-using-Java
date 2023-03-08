import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner dc = new Scanner(System.in);
		System.out.print("Enter year to check leap year: ");
		int year = dc.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			
				System.out.println(year+" is Leap Year");
		}else
			System.out.println(year+" is Not a Leap Year");
		dc.close();

	}

}
