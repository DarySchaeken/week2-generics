package be.pxl.generics.opdracht1;

public class Goochelaar {
	private Animal animal;
	private boolean checkedOnce;
	
	public <T extends Animal> void verstopDier(T animal) {
		this.animal = animal;
	}
	
	public void kijkInHoed() {
		if(!checkedOnce){
			System.out.println("Nothing's there!");
			checkedOnce = true;
		} else {
			System.out.printf("It's a %s!\n", animal.getClass().getSimpleName());
			checkedOnce = false;
		}
	}
}
