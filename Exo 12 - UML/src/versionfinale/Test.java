package versionfinale;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Customer paul = new Customer("Paul");
		
		paul.addRental(new Rental(new Movie("Monty Python and the Holy Grail",Movie.REGULAR),3));
		paul.addRental(new Rental(new Movie("Ran",Movie.REGULAR),2));
		paul.addRental(new Rental(new Movie("Star Trek 27",Movie.NEW_RELEASE),2));
		paul.addRental(new Rental(new Movie("Star Wars 3.2",Movie.CHILDRENS),4));
		paul.addRental(new Rental(new Movie("Wallace and Gromit",Movie.CHILDRENS),6));
		
		System.out.println(paul.statement());
		
		System.out.println(paul.htmlStatement());
		
	}

}
