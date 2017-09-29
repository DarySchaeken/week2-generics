package be.pxl.generics.opdracht3;

public class WorkingPlaceUtility {
	// public static int getScore(WorkingPlace<? extends Bike> workingPlace) { // ex 3.5
	// public static int getScore(WorkingPlace<? extends Vehicle> workingPlace) { // ex 3.6
	// public static int getScore(WorkingPlace<? extends Motorized> workingPlace) { // ex 3.7
	public static <T extends Vehicle & Motorized> int getScore(WorkingPlace<T> workingPlace) { // ex 3.8
		return workingPlace.getNumberOfThingsFixed();
	}
}
