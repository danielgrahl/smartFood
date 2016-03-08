package de.grahl.smartFood.recipe;

import java.net.URI;
import java.util.Collection;
import java.util.List;

public class Recipe {

	private int id;
	private String name;
	private Category category;
	private Culture culture;
	private int serves;
	private Collection<MeasuredIngredient> ingredients;
	private List<String> procedure;
	private URI source;
	private boolean modified;
	private NutritionInfo nutritionInfo;
	
	protected Recipe () {}


	public Recipe(String name, Category category, Culture culture, int serves,
			Collection<MeasuredIngredient> ingredients, List<String> procedure, URI source, boolean modified,
			NutritionInfo nutritionInfo) {
		this.name = name;
		this.category = category;
		this.culture = culture;
		this.serves = serves;
		this.ingredients = ingredients;
		this.procedure = procedure;
		this.source = source;
		this.modified = modified;
		this.nutritionInfo = nutritionInfo;
	}
	
	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public Category getCategory() {
		return category;
	}



	public Culture getCulture() {
		return culture;
	}



	public int getServes() {
		return serves;
	}



	public Collection<MeasuredIngredient> getIngredients() {
		return ingredients;
	}



	public List<String> getProcedure() {
		return procedure;
	}



	public URI getSource() {
		return source;
	}



	public boolean isModified() {
		return modified;
	}



	public NutritionInfo getNutritionInfo() {
		return nutritionInfo;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setCategory(Category category) {
		this.category = category;
	}



	public void setCulture(Culture culture) {
		this.culture = culture;
	}



	public void setServes(int serves) {
		this.serves = serves;
	}



	public void setIngredients(Collection<MeasuredIngredient> ingredients) {
		this.ingredients = ingredients;
	}



	public void setProcedure(List<String> procedure) {
		this.procedure = procedure;
	}



	public void setSource(URI source) {
		this.source = source;
	}



	public void setModified(boolean modified) {
		this.modified = modified;
	}



	public void setNutritionInfo(NutritionInfo nutritionInfo) {
		this.nutritionInfo = nutritionInfo;
	}

	
	
	@Override
	public int hashCode() {
		return id;
	}
	
	public void acceptLayouter (RecipeLayouter rl) {
		rl.header(name, category, culture);
		for (MeasuredIngredient mi: ingredients)
			rl.ingredient(mi);
		for (String step: procedure)
			rl.stage(step);
	}
}
