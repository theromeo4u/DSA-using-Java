import java.util.Scanner;

public class AreaAndCircum {
	static final double PI = 3.14;
	
	static void areaOfcircle(double radius) {
		double area = PI*(radius*radius);
		System.out.println("Area of Circle: "+String.format("%.2f", area));
	}
	
	static void circumOfcircle(double radius) {
		double area = 2*(PI*radius);
		System.out.println("Circumference of Circle: "+String.format("%.2f", area));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of Circle: ");
		double radius = sc.nextDouble();
		areaOfcircle(radius);
		circumOfcircle(radius);
		
		sc.close();
	}

}
