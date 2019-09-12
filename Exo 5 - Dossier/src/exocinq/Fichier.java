package exocinq;

public class Fichier extends Element {

	private int taille;
	
	public Fichier(String nom, int taille) {
		super(nom);
		this.taille = taille;
	}

	@Override
	public String toString() {
		return " (F)-" + super.toString();
	}

	public int getTaille() {
		return taille;
	}	
	
}
