
public class VehiclaInheritance {
	
	public static class Vehicle{
		void go() {
			System.out.println("The vehicle is moving ");
		}
		
		void stop() {
			System.out.println("The vehicle is stopped ");
		}
	}
	
	public static class Car extends Vehicle{
		int wheels = 4;
		int doors = 4;
	}
	
	public static class Bike extends Vehicle{
		int padals = 2;
	}

	public static void main(String[] args) {
		Car car = new Car();
		Bike bike = new Bike();
		car.go();
		bike.stop();
		System.out.println(car.doors);
		System.out.println(bike.padals);

	}

}
