import java.util.Scanner;

public class LargestInputNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=1,larg=num;
		while(num>0) {
			num = sc.nextInt();
			if(num>larg) {
				larg = num;
			}
		}
		System.out.println(larg);
	}

}
