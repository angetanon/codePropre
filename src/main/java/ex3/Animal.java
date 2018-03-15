package ex3;

public class Animal {
	
	private String nom;
	private TypeAnimal typeAnimal;
	private Comportement comportement;
	
	
	
	public Animal(String nom, TypeAnimal typeAnimal, Comportement comportement) {
		super();
		this.nom = nom;
		this.typeAnimal = typeAnimal;
		this.comportement = comportement;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public TypeAnimal getTypeAnimal() {
		return typeAnimal;
	}
	public void setTypeAnimal(TypeAnimal typeAnimal) {
		this.typeAnimal = typeAnimal;
	}
	public Comportement getComportement() {
		return comportement;
	}
	public void setComportement(Comportement comportement) {
		this.comportement = comportement;
	}

}
