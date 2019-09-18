package exo2;

public class Barman extends Humain {
	private static final String BOISSON_BARMAN_DEFAUT = "Vin";

	private String nomBar;

	public Barman(String nom) {
		this(nom, "Chez " + nom);
	}

	public Barman(String nom, String nomBar) {
		super(nom, BOISSON_BARMAN_DEFAUT);
		this.nomBar = nomBar;
	}

	public void servir(Humain humain) {
		parler("Hey," + humain.quelEstTonNom() + " voila ton " + humain.getBoissonFavorite());
		humain.boire();
	}

	@Override
	public void parler(String texte) {
		super.parler(texte + " Coco.");
	}

	@Override
	public void sePresenter() {
		super.sePresenter();
		parler("Mon bar s'appelle: " + nomBar);
	}

}
