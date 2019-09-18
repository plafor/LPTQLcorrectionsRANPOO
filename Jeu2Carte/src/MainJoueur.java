import java.util.ArrayList;
import java.util.List;

public class MainJoueur {

	private String nom;
	private List<Carte> lesCartes;

	public MainJoueur(String nom) {
		this.nom = nom;
		lesCartes = new ArrayList<Carte>();
	}

	public void recevoirCarte(Carte nouvelleCarte) {
		lesCartes.add(nouvelleCarte);
	}

	public String getNom() {
		return nom;
	}

	public Valeur recherchePremierePaire() {
		for (Carte carte: lesCartes) {
			for (Carte uneAutrecarte: lesCartes) {
				if (uneAutrecarte != carte) {
					if (uneAutrecarte.getValeur().equals(carte.getValeur())) {
						return carte.getValeur();
					}
				}
			}
		}
		return null;
	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder("La main " + nom + " contient les cartes suivantes :\n");

		for (Carte carte: lesCartes) {
			res.append(carte + "\n");
		}
		return res.toString();
	}
	
	
	
}
