package be.pxl.generics.opdracht3;

//public class WorkingPlace<T extends Motorized> { //Ex3.1
//public class WorkingPlace<T extends Vehicle> { //Ex3.2
//public class WorkingPlace<T extends Bike> { //Ex3.3
public class WorkingPlace<T extends Vehicle & Motorized> { //Ex3.4???
//public class WorkingPlace<T> {

	private T thingToFix;
	private int numberOfThingsFixed = 0;
	
	public boolean isEmpty() {
		return thingToFix == null;
	}
	
	public void startFixing(T vehicle) {
		if (!isEmpty()) {
			System.out.println("Already busy.");
		} else {
			this.thingToFix = vehicle;
		}
	}
	
	public void finished() {
		thingToFix = null;
		numberOfThingsFixed++;
	}

	public int getNumberOfThingsFixed() {
		return numberOfThingsFixed;
	}
	
	
}
