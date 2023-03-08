import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of row in Array: ");
		int row = sc.nextInt();
		System.out.print("Enter number of col in Array: ");
		int col = sc.nextInt();
		int array[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
