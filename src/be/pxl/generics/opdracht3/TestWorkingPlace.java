package be.pxl.generics.opdracht3;

public class TestWorkingPlace {
	public static void main(String[] args) {
		Car car = new Car(); // Activate when necessary
		//CircularSaw circularSaw = new CircularSaw(); // Activate when necessary
		//Bike bike = new Bike(); // Activate when necessary
		// WorkingPlace<Motorized> test = new WorkingPlace<>(); //Ex 3.1
		// WorkingPlace<Vehicle> test = new WorkingPlace<>(); //Ex 3.2
		// WorkingPlace<Bike> test = new WorkingPlace<>(); //Ex 3.3
		WorkingPlace<Car> test = new WorkingPlace<>(); //Ex 3.4
		//test.startFixing(circularSaw);
		test.startFixing(car);
		//test.startFixing(bike);
	}
}
