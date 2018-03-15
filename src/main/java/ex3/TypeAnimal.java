package ex3;

public enum TypeAnimal {
	MAMMIFERE("Mammifere"),POISSON("Poisson"),REPTILE("Reptile");
	private String type;

	private TypeAnimal(String type) {
		this.type=type;
	}

	public String getType() {
		return type;
	}


}
