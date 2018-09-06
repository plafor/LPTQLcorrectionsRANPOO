package book;
public class Livre {

	private static final int NB_PAGES_DEFAUT = -1;
	private static final String EDITEUR_DEFAUT = "NC";
	private static int numLivre = 1;

	private int numero;
	private String auteur;
	private String titre;
	private String editeur;
	private int nbPages;

	// accesseurs
	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public int getNbPages() {
		return nbPages;
	}

	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	// constructeurs

	public Livre(String auteur, String titre) {
		this(auteur, titre, EDITEUR_DEFAUT, NB_PAGES_DEFAUT);
	}

	public Livre(String auteur, String titre, String editeur, int pages) {
		this.auteur = auteur;
		this.titre = titre;
		this.editeur = editeur;
		nbPages = pages;
		numero = numLivre++;
	}

	public String toString() {
		if (nbPages != NB_PAGES_DEFAUT)
			return "[" + numero + "] " + auteur + " - " + titre + "  (" + editeur + ") " + nbPages + " p.";
		else
			return "[" + numero + "] " + auteur + " - " + titre;
	}

}
