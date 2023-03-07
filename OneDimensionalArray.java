import java.util.*;
public class OneDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of element in Array: ");
		int n = sc.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
