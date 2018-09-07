package exoanimal;

import java.util.ArrayList;
import java.util.List;

public class LesAnimaux {

	private List<Animal> lesAnimaux;

	public LesAnimaux() {
		lesAnimaux = new ArrayList<>();
	}

	public void affPattes(int nbPattes) {
		System.out.println("\nAnimaux de la liste ayant " + nbPattes + " pattes :");
		for (Animal unAnimal : lesAnimaux) {
			if (unAnimal instanceof AnimalAvecPatte) {
				AnimalAvecPatte unAnimalQuiADesPattes = (AnimalAvecPatte) unAnimal;
				if (unAnimalQuiADesPattes.getNbPattes() == nbPattes) {
					System.out.println(" - " + unAnimal);
				}
			}
		}
	}

	public void ajouter(Animal unAnimal) {
		lesAnimaux.add(unAnimal);
	}

	@Override
	public String toString() {
		String res = "Animaux de la liste :";
		for (Animal unAnimal : lesAnimaux) {
			res += "\n\t- " + unAnimal;
		}
		return res;
	}

	public void cacaphonie() {
		System.out.println("\nWhat a mess!");
		for (Animal unAnimal : lesAnimaux) {
			unAnimal.crier();
		}
	}
}
