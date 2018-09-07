package exoanimal;

public abstract class AnimalSansPatte extends Animal {
	
	private int longeur;
	
	public AnimalSansPatte(String race, double poids, int longeur) {
		super(race, poids);
		this.longeur = longeur;
	}

	public int getLongeur() {
		return longeur;
	}

	public void setLongeur(int longeur) {
		this.longeur = longeur;
	}

	@Override
	public String toString() {
		return super.toString() + longeur + " cm";
	}
}
