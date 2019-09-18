package exo2;

public abstract class Humain {

	private static final String BOISSON_HUMAIN_DEFAUT = "eau";

	private String nom;
	private String boissonFavorite;

	public Humain(String nom) {
		this(nom, BOISSON_HUMAIN_DEFAUT);
	}

	public Humain(String nom, String boisson) {
		this.nom = nom;
		this.boissonFavorite = boisson;
	}

	public void parler(String texte) {
		System.out.println(nom + " - " + texte);
	}

	public void sePresenter() {
		parler("Bonjour, je suis " + nom + " et ma boisson favorite est le " + boissonFavorite);
	}

	public void boire() {
		parler("Ah! un bon verre de " + boissonFavorite + " ! GLOUPS!");
	}

	public String quelEstTonNom() {
		return nom;
	}

	public String getBoissonFavorite() {
		return boissonFavorite;
	}
}
