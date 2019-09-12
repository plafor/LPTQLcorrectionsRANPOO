package exocinq;

public abstract class Element {

	private String nom;

	public Element(String nom) {
		super();
		this.nom = nom;
	}

	@Override
	public String toString() {
		return nom;
	}

	public String getNom() {
		return nom;
	}

	public abstract int getTaille();

}
