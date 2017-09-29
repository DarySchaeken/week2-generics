package be.pxl.generics.opdracht1;

public class Goochelaar {
	private Hoed<? extends Animal> hoed;

	public void verstopDier() {
		if (Math.random() <= 0.5) {
			hoed = new Hoed<>(new Bunny());
		} else {
			hoed = new Hoed<>(new Dove());
		}
	}

	public void kijkInHoed() {
		Animal dier = hoed.kijk();
		if (dier == null) {
			System.out.println("HOED IS LEEG");
		} else {
			System.out.println(dier.getClass().getSimpleName());
		}
	}
}
