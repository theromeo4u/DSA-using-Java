
public class VehicleInheritance {

	public static class Vehicle {
		void go() {
			System.out.println("The Vehicle is running");
		}

	}

	public static class Car extends Vehicle {
		void go() {
			System.out.println("Car is Moving");
		}

	}

	public static class Bicycle extends Vehicle {
		void go() {
			System.out.println("Bicycle is Moving");
		}

	}

	public static class Boat extends Vehicle {
		void go() {
			System.out.println("Boat is Moving");
		}

	}

	public static void main(String[] args) {
		
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		Vehicle[] racers = {car,bicycle,boat};
		
		for(Vehicle x: racers) {
			x.go();
			
		}
		
	}

}
