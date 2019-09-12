package exocinq;

import java.util.ArrayList;
import java.util.List;

public class Dossier extends Element {

	private Dossier parent;
	private List<Element> contenu;

	public Dossier(String nom) {
		super(nom);
		parent = this;
		contenu = new ArrayList<>();
	}

	public Dossier(String nom, Dossier parent) {
		this(nom);
		this.parent = parent;
		parent.ajouterElement(this);
	}

	public void ajouterElement(Element sousDossier) {
		contenu.add(sousDossier);
	}

	public void afficheContenu() {
		System.out.println("Contenu du dossier '" + getNom() + "' (dossier parent '" + parent.getNom() + "') :");
		for (Element unElement : contenu) {
			System.out.println(unElement);
		}
	}

	public void afficheTaille() {
		System.out.println("\nTaille du dossier '" + getNom() + "' : " + getTaille());
	}

	public int getTaille() {
		int taille = 0;

		for (Element element : contenu) {
			taille += element.getTaille();
		}

		return taille;
	}

	public void afficheFichier(int tailleMin) {
		System.out.println("\nFichier(s) dont la taille est sup. a " + tailleMin + ":\n" + listeFichier(tailleMin));

	}

	private String listeFichier(int tailleMin) {
		StringBuilder res = new StringBuilder();
		for (Element element : contenu) {
			if (element instanceof Fichier) {
				if (element.getTaille() > tailleMin) {
					res.append(element + " - " + element.getTaille() + "\n");
				}
			} else {
				res.append(((Dossier)element).listeFichier(tailleMin));
			}
		}
		return res.toString();

	}

	@Override
	public String toString() {
		return " (R)-" + super.toString();
	}
}
