package de.grahl.smartFood.recipe;

import java.net.URI;

public interface RecipeLayouter {

	public void header (String name, Category cat, Culture cult);
	public void stage (String name);
	public void ingredient (MeasuredIngredient ingredient);
	public void nutritionInfo (NutritionInfo ni);
	public void source (URI source, boolean modified);
	public void doLayout();
}
