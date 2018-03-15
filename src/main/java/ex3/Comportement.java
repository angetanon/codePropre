package ex3;

public enum Comportement {
	HERBIVORE("Herbivore"),CARNIVORE("Carnivore");
	private String type;

	private Comportement(String type) {
		this.type=type;
	}

	public String getType() {
		return type;
	}
}
