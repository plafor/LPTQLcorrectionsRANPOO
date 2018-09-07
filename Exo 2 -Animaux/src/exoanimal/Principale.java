package exoanimal;

public class Principale {

	public static void main(String[] args) {

		Animal leChien = new Chien("Labrador", 40, 1);
		Animal unSerpent = new Serpent("Serpent à sonnette", 5, 300, true);
		Animal unCanard = new Canard("Mulard", 4);

		LesAnimaux mesAnimaux = new LesAnimaux();

		mesAnimaux.ajouter(leChien);
		mesAnimaux.ajouter(unCanard);
		mesAnimaux.ajouter(unSerpent);

		((AnimalAvecPatte) leChien).setNbPattes(3);

		System.out.println(mesAnimaux);

		mesAnimaux.cacaphonie();

		mesAnimaux.affPattes(2);
	}
}
