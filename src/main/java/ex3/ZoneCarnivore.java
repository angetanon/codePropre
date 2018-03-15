package ex3;

public class ZoneCarnivore extends ZoneAnimal {



	
	
	public ZoneCarnivore(String nom) {
		super(nom);

	}

	public double calculerKgsNourritureParJour(){
		return animaux.size() * 10;
	}
}
