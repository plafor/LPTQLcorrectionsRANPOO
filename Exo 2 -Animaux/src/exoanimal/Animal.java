package exoanimal;

public abstract class Animal {
	
	private double poids;
	private String race;
	
	public Animal(String race, double poids){
		this.race=race;
		this.poids=poids;
	}

	public double getPoids() {
		return poids;
	}

	public String getRace() {
		return race;
	}

	@Override
	public String toString() {
		return race + ", " + poids + " kg, ";
	}

	public abstract void crier();
	
}
