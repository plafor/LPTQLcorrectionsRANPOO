package exo1;

public class CowBoy extends Humain {
	
	private static final String ADJECTIF_COWBOY_DEFAUT = "vaillant";
	public static final String BOISSON_COWBOY_DEFAUT = "whisky";
	
	private int popularite;
	private String adjectif;

	public CowBoy(String nom) {
		this(nom, BOISSON_COWBOY_DEFAUT, ADJECTIF_COWBOY_DEFAUT);
	}

	public CowBoy(String nom, String boissonFavorite, String adjectif) {
		super(nom, boissonFavorite);
		this.adjectif = adjectif;
		popularite = 0;
	}

	public void tirer(Brigand brigand) {
		System.out
				.println("*Le " + adjectif + " " + quelEstTonNom() + " tire sur " + brigand.quelEstTonNom() + ". PAN!");
		parler("Prend ca, rascal !");
	}

	public void liberer(Dame dame) {
		parler("Que vous etes jolie " + dame.quelEstTonNom());
		dame.estLibereePar(this);
		popularite++;
	}

	@Override
	public void sePresenter() {
		super.sePresenter();
		parler("On dit que je suis " + adjectif);
		parler("Ma popularite est de " + popularite);
	}

}
