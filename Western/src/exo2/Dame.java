package exo2;

public class Dame extends Humain implements VisagePale {

	private static final String BOISSON_DAME_DEFAUT = "lait";
	
	private String couleurRobe;
	private boolean libre = true;

	public Dame(String nom, String couleur) {
		this(nom, BOISSON_DAME_DEFAUT, couleur);
	}

	public Dame(String nom, String boisson, String couleur) {
		super(nom, boisson);
		this.couleurRobe = couleur;
	}

	public void estKidnappeePar(HorsLaLoi brigand) {
		parler("AhAHAH! Au secours! " + brigand.quelEstTonNom() + " m'enleve !");
		libre = false;
	}

	public void estLibereePar(CowBoy cowboy) {
		if (libre) {
			parler("Désolé " + cowboy.quelEstTonNom() + " mais je suis deja une femme libre !");
			return;
		}
		parler("Ouf ! Je suis sauvee ! Merci " + cowboy.quelEstTonNom());
		libre = true;
	}

	public void changerRobe(String couleur) {
		this.couleurRobe = couleur;
		parler("Regardez ma nouvelle robe " + this.couleurRobe + " !");
	}

	@Override
	public String quelEstTonNom() {
		return "Miss " + super.quelEstTonNom();
	}

	@Override
	public void sePresenter() {
		super.sePresenter();
		parler("Ma robe est " + couleurRobe);
	}

	@Override
	public void seFaireScalper() {
		parler("Aie ma tete!");		
	}
}
