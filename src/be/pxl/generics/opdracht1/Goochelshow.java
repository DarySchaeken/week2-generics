package be.pxl.generics.opdracht1;

public class Goochelshow {	
	public static void main(String[] args) {
		Animal[] animals = { new Bunny(), new Dove(), new Bunny(), new Bunny(), new Dove() };
		Goochelaar goochelaar = new Goochelaar();
		for(int i = 0; i  < 5; i++) {
			System.out.println("Goocheltruc " + (i+1));
			goochelaar.verstopDier(animals[i]);
			goochelaar.kijkInHoed();
			goochelaar.kijkInHoed();
		}
	}
}
