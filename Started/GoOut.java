import java.util.Scanner;

public class GoOut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month: ");
		String month = sc.next();
		month = month.toLowerCase();
		int days = 0;
		switch(month) {
		case "january":
		case "march":
		case "may":
		case "july":
		case "august":
		case "october":
		case "december":
			days=31;
			Goout(days);
			break;
		case "february":
			days=28;
			Goout(days);
			break;
		case "april":
		case "june":
		case "september":
		case "november":
			days=30;
			Goout(days);
			break;
		default:
			System.out.println("Enter Correct month");
		}

	}

	static void Goout(int days) {
		int cnt = 0;
		for (int i = 0; i <days; i++) {
			if(i%2==0) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}

}
