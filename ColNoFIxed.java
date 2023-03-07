import java.util.Scanner;

public class ColNoFIxed {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter number of row in Array: ");
//		int row = sc.nextInt();
//		System.out.print("Enter number of col in Array: ");
//		int col = sc.nextInt();
		int array[][] = {
				{1,2,3},
				{4,5},
				{6,7,8,9}
		};
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
