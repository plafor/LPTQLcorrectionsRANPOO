
public class Carte {

	private Valeur valeur;
	private Couleur couleur;
	
	public Carte(Valeur valeur, Couleur couleur) {
		super();
		this.valeur = valeur;
		this.couleur = couleur;
	}
	
	public Valeur getValeur() {
		return valeur;
	}
	public Couleur getCouleur() {
		return couleur;
	}
	
	@Override
	public String toString() {
		return valeur + " de " + couleur;
	}
	
	
}
