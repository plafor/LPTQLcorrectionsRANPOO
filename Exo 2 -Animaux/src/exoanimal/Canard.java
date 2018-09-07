package exoanimal;

public class Canard extends AnimalAvecPatte {

	private static final int NB_PATTES_DEFAUT = 2;

	public Canard(String race, double poids) {
		super(race, poids, NB_PATTES_DEFAUT);
	}

	@Override
	public void crier() {
		System.out.println("Coin Coin");
	}
}
