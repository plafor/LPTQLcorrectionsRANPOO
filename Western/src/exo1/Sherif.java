package exo1;

public class Sherif extends CowBoy {
	
	private static final String ADJECTIF_SHERIF_DEFAUT = "honnete";
	
	private int nbMechantsCoffres;

	public Sherif(String nom) {
		super(nom, CowBoy.BOISSON_COWBOY_DEFAUT, ADJECTIF_SHERIF_DEFAUT);
		nbMechantsCoffres = 0;
	}

	public void coffrer(Brigand brigand) {
		parler("Au nom de la loi je vous arrete !");
		brigand.seFaireEmprisonner(this);
		nbMechantsCoffres++;
	}

	@Override
	public void sePresenter() {
		super.sePresenter();
		parler("J'ai arrete " + nbMechantsCoffres + " brigands.");
	}

	@Override
	public String quelEstTonNom() {
		return "Sherif " + super.quelEstTonNom();
	}

	public void rechercher(Brigand brigand) {
		parler("OYEZ OYEZ BRAVE GENS !! " + brigand.getRecompense()
				+ "$ a qui arretera " + brigand.quelEstTonNom()
				+ " mort ou vif !");
	}
}
