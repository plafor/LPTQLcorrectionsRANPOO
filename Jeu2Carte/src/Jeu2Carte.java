import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jeu2Carte {

	private static final int NB_MELANGE = 1000;
	
	private List<Carte> lesCartes;

	public Jeu2Carte() {
		lesCartes = new ArrayList<Carte>();
		for (Couleur col : Couleur.values()) {
			for (Valeur val : Valeur.values()) {
				lesCartes.add(new Carte(val, col));
			}
		}
	}

	public void brasser() {
		Collections.shuffle(lesCartes);
	}

	public Carte distribuerCarte() throws PasDeCarteException {
		if (lesCartes.isEmpty())
			throw new PasDeCarteException("Plus de carte disponible dans le jeu");
		return lesCartes.remove(lesCartes.size() - 1);
	}

	public String toString() {
		StringBuffer st = new StringBuffer("Voici les " + lesCartes.size() + " cartes du jeu :\n");
		for (Carte c : lesCartes)
			st.append(c);
		return st.toString();
	}

	public boolean aDesCartes() {
		return lesCartes.size() > 0;
	}
}
