import java.util.Scanner;

public class CGPA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of subject : ");
		int n = sc.nextInt();
		System.out.print("Enter "+n+" subejct marks: ");
		double marks[] = new double[n];
		double total=0;
		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextDouble();
			total += marks[i];
		}
		double cgpa = total/n;
		System.out.println("Your CGPA is : "+ String.format("%.2f", cgpa));
	}

}
