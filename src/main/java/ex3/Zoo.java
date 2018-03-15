package ex3;

public class Zoo {

	private String nom;
	private ZoneAnimal zoneAnimal;
	private SavaneAfricaine savaneAfricaine = new SavaneAfricaine("no");
	private ZoneCarnivore zoneCarnivore = new ZoneCarnivore("nom");
	private FermeReptile fermeReptile = new FermeReptile("nom");
	private Aquarium aquarium = new Aquarium("nom");
	private Animal animal;
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	public void addAnimal(Animal animal){
//	
		
		if (animal.getTypeAnimal().equals(TypeAnimal.MAMMIFERE) && animal.getComportement().equals(Comportement.CARNIVORE)){
			zoneCarnivore.addAnimal(animal);
		}
		else if (animal.getTypeAnimal().equals(TypeAnimal.MAMMIFERE) && animal.getComportement().equals(Comportement.HERBIVORE)){
			savaneAfricaine.addAnimal(animal);
		}
		else if (animal.getTypeAnimal().equals(TypeAnimal.REPTILE)){
			fermeReptile.addAnimal(animal);
		}
		else if (animal.getTypeAnimal().equals(TypeAnimal.POISSON)){
			aquarium.addAnimal(animal);
		}
		
		
		
	}
	
	public void afficherListeAnimaux(){
		
		
		
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public ZoneAnimal getZoneAnimal() {
		return zoneAnimal;
	}

	public void setZoneAnimal(ZoneAnimal zoneAnimal) {
		this.zoneAnimal = zoneAnimal;
	}
}
