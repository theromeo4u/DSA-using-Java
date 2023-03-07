import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before Swapping: "+x +" and "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swapping: "+x +" and "+y);
		sc.close();
	}

}
  