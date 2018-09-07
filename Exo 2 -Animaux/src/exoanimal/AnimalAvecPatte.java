package exoanimal;

public abstract class AnimalAvecPatte extends Animal {

	private int nbPattes;

	public AnimalAvecPatte(String race, double poids, int nbPattes) {
		super(race, poids);
		this.nbPattes = nbPattes;
	}

	public int getNbPattes() {
		return nbPattes;
	}

	public void setNbPattes(int nbPattes) {
		this.nbPattes = nbPattes;
	}

	@Override
	public String toString() {
		return super.toString() + nbPattes + " pattes";
	}
}
