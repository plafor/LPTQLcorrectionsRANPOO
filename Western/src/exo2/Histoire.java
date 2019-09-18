package exo2;

public class Histoire {

	public static void main(String[] args) {

		System.out.println("---------------Q2.3-----------------");
		Ripoux george = new Ripoux("George W. Bush");
		george.sePresenter();
		Dame margaret = new Dame("Margaret Thatcher", "bleu");
		george.kidnapper(margaret);
		Sherif luke = new Sherif("Lucky Luke");
		luke.rechercher(george);
		luke.coffrer(george);
		luke.liberer(margaret);

		System.out.println("---------------Q2.4-----------------");
		FemmeBrigand sophieLaGirafe = new FemmeBrigand("Fugitive de l'asile", "jaune");
		sophieLaGirafe.sePresenter();
		sophieLaGirafe.kidnapper(sophieLaGirafe);

		System.out.println("---------------Q2.4-----------------");
		Indien al = new Indien("Al Capone", "thomson");
		al.sePresenter();
		CowBoy john = new CowBoy("John Lenine", "le magnifiquement bienveillant pour tous les peuples du monde", "Goutte");
		al.scalp(john);
		al.sePresenter();
	
	
		
	}

}
