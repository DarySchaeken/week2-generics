package be.pxl.generics.opdracht1;

public class Hoed<E extends Animal> {
	private boolean checkedOnce = false;
	private E animal;
	
	public Hoed(E animal) {
		this.animal = animal;
	}
	
	public E kijk(){
		if(!checkedOnce){
			checkedOnce = true;
			return null;
		} else {
			return animal;
		}
	}

}
