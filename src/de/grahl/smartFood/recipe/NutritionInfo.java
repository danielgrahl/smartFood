package de.grahl.smartFood.recipe;

import java.util.Map;

public class NutritionInfo {
	
	private Map<NutritionInfoCategory, Number> info;
	
	public String toString() {
		String s = "";
		for (NutritionInfoCategory c: info.keySet()) {
			s += c + ": " + info.get(c) + c.unit + "\n";
		}
		return s;
	}
	
	private static enum NutritionInfoCategory {
		CARB("Kohlenhydrate"),
		SUGAR("davon Zucker"),
		PROT("Eiweiß"),
		FAT("Fett"),
		FAT_UNSAT("davon ungesättigte Fettsäuren"),
		FAT_SAT("davon gesättigte Fettsäuren")
		;
		
		
		private String name;
		private String unit;
		private NutritionInfoCategory(String n, String u) {
			name = n;
			unit = u;
		}
		private NutritionInfoCategory(String n) {
			this(n, "g");
		}
		public String toString() {
			return name;
		}
	}

}
