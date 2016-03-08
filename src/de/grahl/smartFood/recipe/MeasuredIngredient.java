package de.grahl.smartFood.recipe;

import de.grahl.smartFood.ingredient.Ingredient;
import de.grahl.smartFood.ingredient.Measure;

public final class MeasuredIngredient extends Object {

	public final Ingredient ingredient;
	public final Measure measure;
	public final int amount;
	
	MeasuredIngredient(Ingredient i, Measure m, int a) {
		assert i != null;
		assert m != null;
		assert a > 0;
		ingredient = i;
		measure = m;
		amount = a;
	}
	
	MeasuredIngredient(Ingredient i, int a) {
		this(i, i.getMeasure(), a);
	}
}
