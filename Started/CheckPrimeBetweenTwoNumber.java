import java.util.Scanner;

public class CheckPrimeBetweenTwoNumber {
	
	static void primeBetween(int start, int end, int arr[]) {
		for (int i = start; i < end; i++) {
			if(i%2==0) {
				arr[i] += i; 
			}
		}
		System.out.print("Prime Number are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[1000];
		System.out.print("Enter number 1: ");
		int start = sc.nextInt();
		System.out.print("Enter number 2: ");
		int end = sc.nextInt();
		primeBetween(start, end, arr);

	}

}
