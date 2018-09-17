package trophee;

public class Etudiant extends PorteurDeTrophee {
	
	private int nbTrophee;
	
	public Etudiant(String nom) {
		this(nom, 0);
	}

	public Etudiant(String nom, int nbTrophee) {
		super(nom);
		this.nbTrophee = nbTrophee;
	}

	public int getNbTrophee() {
		return nbTrophee;
	}

	@Override
	public String toString() {
		return "(ETU) " + super.toString();
	}

	@Override
	public void recevoirTrophee() {
		nbTrophee++;
	}
	
	

}
