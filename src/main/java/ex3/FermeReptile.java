package ex3;

public class FermeReptile extends ZoneAnimal {

	public FermeReptile(String nom) {
		super(nom);

	}

	public double calculerKgsNourritureParJour() {
		return animaux.size() * 0.1;
	}
}
