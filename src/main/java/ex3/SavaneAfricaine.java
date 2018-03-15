package ex3;

public class SavaneAfricaine extends ZoneAnimal {

	public SavaneAfricaine(String nom) {
		super(nom);

	}

	public double calculerKgsNourritureParJour() {
		return animaux.size() * 10;
	}
}
