package de.grahl.smartFood.recipe;

public enum Category {
	CARB("Kohlenhydrat"),
	PROTEIN("Eiweiß"),
	;
	
	private String name;
	private Category(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}
