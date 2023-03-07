import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("how many number arte there to calculate Average: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		int avg = sum/num;
		System.out.println(avg);

	}

}
