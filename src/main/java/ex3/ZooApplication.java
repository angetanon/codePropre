package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
				
		
		
	
		

	zoo.addAnimal(new Animal("Gazelle", TypeAnimal.MAMMIFERE, Comportement.HERBIVORE));
	zoo.addAnimal(new Animal("Zebre", TypeAnimal.MAMMIFERE, Comportement.HERBIVORE));
	zoo.addAnimal(new Animal("Lion", TypeAnimal.MAMMIFERE, Comportement.HERBIVORE));
	zoo.addAnimal(new Animal("panthere", TypeAnimal.MAMMIFERE, Comportement.CARNIVORE));
	zoo.addAnimal(new Animal("Requin blanc", TypeAnimal.POISSON, Comportement.HERBIVORE));
	zoo.addAnimal(new Animal("Truite dor�e", TypeAnimal.POISSON, Comportement.HERBIVORE));
	zoo.addAnimal(new Animal("Boa constrictor", TypeAnimal.REPTILE, Comportement.CARNIVORE));
	zoo.addAnimal(new Animal("Python", TypeAnimal.REPTILE, Comportement.CARNIVORE));
	
	
	
	zoo.afficherListeAnimaux();

	
	}
	
	

}
