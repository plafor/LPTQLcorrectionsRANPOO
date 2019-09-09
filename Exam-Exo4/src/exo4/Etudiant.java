package exo4;

public class Etudiant extends Personne implements Virable {
	private boolean vir�;

	public Etudiant(String sonNom) {
		super(sonNom);
		vir� = false;
	}

	public String toString() {
		return super.toString() + " (ETU)";
	}

	public void sortir() {
		vir� = true;
	}
}
