import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your UID and DEPT");
		int uid = sc.nextInt();
		String dept = sc.next();
		switch (uid) {
		case 1:
			System.out.println("Subodh Kumar");
			break;
		case 2:
			System.out.println("Rohit Kumar");
			break;
		case 3:
			System.out.println("Rahul Kumar");
			break;
		case 4:
			System.out.println("Department");
			switch (dept) {
			case "IT":
				System.out.println("IT Department");
				break;
			case "Comp":
				System.out.println("Comp Department");
				break;
			case "Management":
				System.out.println("Management Department");
				break;

			default:
				System.out.println("Invalid Departemnt");
				
			}
			break;
		default:
			System.out.println("Invalid UID");
			break;
		}
	}

}
