package trophee;

public abstract class PorteurDeTrophee {

	private String nom;

	public PorteurDeTrophee(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return nom;
	}
	
	public abstract int getNbTrophee();
	
	public abstract void recevoirTrophee();
	
}
