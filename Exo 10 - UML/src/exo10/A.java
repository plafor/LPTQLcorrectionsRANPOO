package exo10;

public class A extends B {
	private C c;

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	public void methode2() {
		getC().affiche(this);
	}
}
