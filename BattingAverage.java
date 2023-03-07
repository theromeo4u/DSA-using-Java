import java.util.Scanner;

public class BattingAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number on innings: ");
		int ing = sc.nextInt();
		System.out.print("Enter "+ing+" scored by the batsman: ");
		int score[] = new int [ing];
		float run=0;
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			run += score[i];
		}
		float BatAvg = run/ing;
		System.out.println(String.format("%.2f",BatAvg));
	}

}
