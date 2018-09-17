package trophee;

public class Test {

	public static void main(String[] args) {

		Etudiant jack = new Etudiant("Jack"); // nb trophees par defaut = 0
		Etudiant sawyer = new Etudiant("Sawyer", 5);
		Etudiant kate = new Etudiant("Kate", 1);
		kate.recevoirTrophee();
		GroupeEtudiant groupe2perdus = new GroupeEtudiant("�tudiants perdus");
		groupe2perdus.ajouterPorteurDeTrophee(jack);
		groupe2perdus.ajouterPorteurDeTrophee(sawyer);
		groupe2perdus.ajouterPorteurDeTrophee(kate);
		Etudiant bree = new Etudiant("Bree");
		Etudiant gabie = new Etudiant("Gabie", 2);
		gabie.recevoirTrophee(); // augmente de 1 les troph�es
		GroupeEtudiant groupe2wisteria = new GroupeEtudiant("�tudiants d�sesp�r�s");
		groupe2wisteria.ajouterPorteurDeTrophee(bree);
		groupe2wisteria.ajouterPorteurDeTrophee(gabie);
		GroupeEtudiant groupe2serie = new GroupeEtudiant("S�rie d'�tudiants");
		groupe2serie.ajouterPorteurDeTrophee(groupe2perdus);
		groupe2serie.ajouterPorteurDeTrophee(new Etudiant("Daffy Duck", 2));
		groupe2serie.ajouterPorteurDeTrophee(groupe2wisteria);
		groupe2serie.afficheGroupe(); // pas en profondeur
		groupe2serie.recevoirTrophee(); // on donne un trophee � tous (en profondeur)
		groupe2serie.afficheTotalTrophees(); // calcul en profondeur
		groupe2perdus.afficheEtudiantAyantAuMoinsTrophees(3); // pas en profondeur

	}

}
