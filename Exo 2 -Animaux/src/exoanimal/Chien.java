package exoanimal;

public class Chien extends AnimalAvecPatte {

	private static final int NB_PATTES_DEFAUT = 4;
	
	private int categorie;

	public Chien(String race, double poids, int categorie) {
		super(race, poids, NB_PATTES_DEFAUT);
		this.categorie = categorie;
	}

	public int getCategorie() {
		return categorie;
	}

	@Override
	public String toString() {
		return super.toString() + ", categorie " + categorie;
	}

	@Override
	public void crier() {
		System.out.println("Ouaf Ouaf");
	}
}
