package trophee;

import java.util.*;

public class GroupeEtudiant extends PorteurDeTrophee {

	private List<PorteurDeTrophee> lesPorteursDeTrophees;

	public GroupeEtudiant(String nom) {
		super(nom);
		lesPorteursDeTrophees = new ArrayList<>();
	}

	public void ajouterPorteurDeTrophee(PorteurDeTrophee nouveauPorteurDeTrophee) {
		lesPorteursDeTrophees.add(nouveauPorteurDeTrophee);
	}

	@Override
	public String toString() {
		return "(GRP) " + super.toString();
	}

	public void afficheGroupe() {
		System.out.println("Le groupe '" + getNom() + "' contient :");

		Iterator<PorteurDeTrophee> it = lesPorteursDeTrophees.iterator();
		while (it.hasNext()) {
			System.out.println(" - " + it.next());
		}
	}

	public void afficheTotalTrophees() {
		System.out.println("Le groupe '" + getNom() + "' possède : " + getNbTrophee() + " trophees");
	}

	public void afficheEtudiantAyantAuMoinsTrophees(int nbTropheeMin) {
		System.out.println("Etudiants du groupe '" + getNom() + "' ayant au moins " + nbTropheeMin + " trophees :");
		for (PorteurDeTrophee porteur : lesPorteursDeTrophees) {
			if (porteur instanceof Etudiant) {
				if (porteur.getNbTrophee() >= nbTropheeMin) {
					System.out.println(porteur + " (" + porteur.getNbTrophee() + " trophées)");
				}
			}
		}
	}

	@Override
	public int getNbTrophee() {
		int res = 0;
		for (PorteurDeTrophee porteur : lesPorteursDeTrophees) {
			res += porteur.getNbTrophee();
		}
		return res;
	}

	@Override
	public void recevoirTrophee() {
		for (PorteurDeTrophee unPorteur : lesPorteursDeTrophees) {
			unPorteur.recevoirTrophee();
		}
	}

}
