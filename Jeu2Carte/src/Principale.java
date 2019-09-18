
public class Principale {

	private static final int NB_TIRAGE = 100;

	public static void main(String[] args) {

		Jeu2Carte leJeu = new Jeu2Carte();
//		System.out.println("Jeu initial");
//		System.out.println(leJeu);

//		System.out.println("Apres brassage");
		leJeu.brasser();
//		System.out.println(leJeu);

		MainJoueur mainJ1 = new MainJoueur("joueur 1");
		MainJoueur mainJ2 = new MainJoueur("joueur 2");
		
		
		for (int i = 0; i< 5; i++) {
			try {
				mainJ1.recevoirCarte(leJeu.distribuerCarte());
				mainJ2.recevoirCarte(leJeu.distribuerCarte());
			} catch (PasDeCarteException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println(mainJ1);
		System.out.println(mainJ2);
		
		System.out.println("La premiere paire trouvee dans la main " 
				+ mainJ1.getNom() 
				+ " : " 
				+ mainJ1.recherchePremierePaire());
		
		System.out.println("La premiere paire trouvee dans la main " 
				+ mainJ2.getNom() 
				+ " : " 
				+ mainJ2.recherchePremierePaire());
		
//		if (carte1 != null && carte2 != null){
//				System.out.print("\n"+carte1 + " et "+ carte2);
//				if (carte1.memeValeurQue(carte2))
//					System.out.print(" => Paire de " + carte1.getLaValeur());
//			}
//		}

	}

}
