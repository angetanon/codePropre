package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class ZoneAnimal {

	protected List<Animal> animaux ;
	protected String nom;

	public ZoneAnimal(String nom) {
		super();

		this.nom = nom;
		this.animaux = new ArrayList<Animal>();
	}

	public abstract double calculerKgsNourritureParJour();

	public void addAnimal(Animal animal) {

		animaux.add(animal);

	}

	public void afficherListeAnimaux() {
		for (Animal animal : animaux) {
			System.out.println(animal);
		}
	}

	public int compterAnimaux() {
		return animaux.size();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
