import java.util.Scanner;

public class Fabo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for fabonacci Series: ");
		int n = sc.nextInt();
		int a=0,b=1,temp;
		while(n>0) {
			System.out.println(a);
			temp = a+b;
			a=b;
			b=temp; 
			n--;
		}
		sc.close();
	}

}
