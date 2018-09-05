public class TestLivre {

	public static void main(String[] args) {

		Livre[] livres = new Livre[3];

		livres[0] = new Livre("Anonyme", "Le livre sans nom");
		livres[1] = new Livre("Pierre laforcade", "Chroniques d'un professeur adulé", "Rire editions", 42);
		livres[2] = new Livre("Andrzej Sapkowski", "Le Dernier Voeu");

		for (int i = 0; i < livres.length; i++) {
			System.out.println(livres[i]);
		}
	}

}
