package exo2;

public class FemmeBrigand extends Dame implements HorsLaLoi {

	private int recompense;
	private boolean enPrison;

	public FemmeBrigand(String nom, String couleur) {
		super(nom, couleur);
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
		recompense += 50;
	}

	public void seFaireEmprisonner(CowBoy cowboy) {
		parler("Damned, je suis fait ! " + cowboy.quelEstTonNom() + ", tu m'as eu !");
		recompense = 0;
		enPrison = true;
	}

}
