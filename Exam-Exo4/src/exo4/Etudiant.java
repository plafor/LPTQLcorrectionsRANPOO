package exo4;

public class Etudiant extends Personne implements Virable {
	private boolean viré;

	public Etudiant(String sonNom) {
		super(sonNom);
		viré = false;
	}

	public String toString() {
		return super.toString() + " (ETU)";
	}

	public void sortir() {
		viré = true;
	}
}
