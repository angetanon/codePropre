package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
				
		
		
	Animal gazelle = new Animal("Gazelle", TypeAnimal.MAMMIFERE, Comportement.HERBIVORE);
	Animal zebre = new Animal("Zebre", TypeAnimal.MAMMIFERE, Comportement.HERBIVORE);
	Animal lion = new Animal("Lion", TypeAnimal.MAMMIFERE, Comportement.HERBIVORE);
	Animal panthere = new Animal("panthere", TypeAnimal.MAMMIFERE, Comportement.CARNIVORE);
	Animal requinBlanc = new Animal("Requin blanc", TypeAnimal.POISSON, Comportement.HERBIVORE);
	Animal truiteDoree = new Animal("Truite dorée", TypeAnimal.POISSON, Comportement.HERBIVORE);
	Animal boaConstrictor = new Animal("Boa constrictor", TypeAnimal.REPTILE, Comportement.CARNIVORE);
	Animal python = new Animal("Python", TypeAnimal.REPTILE, Comportement.CARNIVORE);
		

	zoo.addAnimal(gazelle);
	zoo.addAnimal(zebre);
	zoo.addAnimal(lion);
	zoo.addAnimal(panthere);
	zoo.addAnimal(requinBlanc);
	zoo.addAnimal(truiteDoree);
	zoo.addAnimal(boaConstrictor);
	zoo.addAnimal(python);
	
	
	
	zoo.afficherListeAnimaux();
	}
	
	

}
