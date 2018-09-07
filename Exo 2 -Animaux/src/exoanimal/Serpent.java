package exoanimal;

public class Serpent extends AnimalSansPatte {

	private boolean venimeux;

	public Serpent(String race, double poids, int longeur, boolean venimeux) {
		super(race, poids, longeur);
		this.venimeux = venimeux;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + (venimeux ? "" : "pas ") + "venimeux";
	}

	@Override
	public void crier() {
		System.out.println("Tsss Tssss");
	}
}
