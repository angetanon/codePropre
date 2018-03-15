package ex3;

public class Aquarium extends ZoneAnimal{

	
		
	public Aquarium(String nom) {
		super(nom);
	
	}

	public double calculerKgsNourritureParJour(){
		return animaux.size() * 0.2;
	}
}
