package exo1;

public class Brigand extends Humain {
	
	public static final String BOISSON_BRIGAND_DEFAUT = "tord-boyaux";
	public static final String LOOK_BRIGAND_DEFAUT = "mechant";
	
	private String look;
	private int nbDameEnlevees;
	private int recompense;
	private boolean enPrison;

	public Brigand(String nom) {
		this(nom, BOISSON_BRIGAND_DEFAUT, LOOK_BRIGAND_DEFAUT);
	}

	public Brigand(String nom, String boisson,String look) {
		super(nom, boisson);
		this.look = look;
		recompense = 100;
		nbDameEnlevees = 0;
		enPrison = false;
	}

	public int getRecompense() {
		return recompense;
	}

	public void kidnapper(Dame dame) {
		if (enPrison) {
			parler("Je ne peux pas la kidnapper ! je suis déjà en prison !");
			return;
		}
		parler("Ah Ah! " + dame.quelEstTonNom() + ", tu es mienne desormais !");
		dame.estKidnappeePar(this);
		nbDameEnlevees++;
		recompense += 50;
	}

	public void seFaireEmprisonner(CowBoy cowboy) {
		parler("Damned, je suis fait ! " + cowboy.quelEstTonNom() + ", tu m'as eu !");
		recompense = 0;
		enPrison = true;
	}

	@Override
	public String quelEstTonNom() {
		return super.quelEstTonNom() + " le " + look;
	}

	@Override
	public void sePresenter() {
		super.sePresenter();
		parler("J'ai l'air " + look + " et j'ai deja kidnappe " + nbDameEnlevees + " dames !");
		parler("Ma tete est mise a prix pour " + recompense + "$");
	}

}
