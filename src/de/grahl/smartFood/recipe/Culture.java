package de.grahl.smartFood.recipe;

public enum Culture {
	
	NORTHERN("nordeuropäisch"),
	MEDITERRANIAN("mediterran"),
	ORIENTAL("orientalisch"),
	INDIAN("indisch"),
	CHINESE("chinesisch"),
	JAPANESE("japanisch"),
	FAST_FOOD("fast food"),
	UNKNOWN("unbekannt"),
	;
	
	private String name;
	
	private Culture(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

}
