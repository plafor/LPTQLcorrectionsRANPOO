package exo2;

public class Indien extends Humain {

	private static final String TOTEM_DEFAUT = "Coyote";
	private static final String BOISSON_INDIEN_DEFAUT = "Jus de racine";
	
	private int nbPlume;
	private String totem;

	public Indien(String nom) {
		this(nom, TOTEM_DEFAUT);
	}

	public Indien(String nom, String totem) {
		super(nom, BOISSON_INDIEN_DEFAUT);
		this.totem = totem;
		nbPlume = 0;
	}

	@Override
	public void parler(String texte) {
		super.parler(texte + " Ugh!");
	}

	@Override
	public void sePresenter() {
		super.sePresenter();
		parler("J'ai " + nbPlume + " plumes.");
		parler("Mon totem est le " + totem);
	}

	public void scalp(VisagePale unVisagePale) {
		parler("Heureusement que j'ai pense a prendre mon couteau !");
		unVisagePale.seFaireScalper();
		nbPlume++;
	}

}
