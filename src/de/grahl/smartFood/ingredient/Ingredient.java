package de.grahl.smartFood.ingredient;

import javax.persistence.*;

@Entity
@Table(name="INGREDIENTS")
public class Ingredient {


	private int id;
	private Measure measure;
	private String name;
	private boolean regional;
	private PeriodOfYear season;
	private Integer unitWeight;
	private boolean vegetarian;
	
	// XXX
	public final static Ingredient MOCK =
			new Ingredient(Measure.UNIT, "Apfel", true, PeriodOfYear.ALWAYS, 200, true);
	
	protected Ingredient () {}

	public Ingredient(Measure measure, String name, boolean regional, PeriodOfYear season, Integer unitWeight,
			boolean vegetarian) {
		this.measure = measure;
		this.name = name;
		this.regional = regional;
		this.season = season;
		this.unitWeight = unitWeight;
		this.vegetarian = vegetarian;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}


	@Column
	public Measure getMeasure() {
		return measure;
	}


	@Column(nullable=false)
	public String getName() {
		return name;
	}


	@Column
	public PeriodOfYear getSeason() {
		return season;
	}


	@Column
	public Integer getUnitWeight() {
		return unitWeight;
	}


	@Override
	public int hashCode() {
		return id;
	}


	@Column
	public boolean isRegional() {
		return regional;
	}


	@Column
	public boolean isVegetarian() {
		return vegetarian;
	}


	protected void setId(int id) {
		this.id = id;
	}

	public void setMeasure(Measure measure) {
		this.measure = measure;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRegional(boolean regional) {
		this.regional = regional;
	}
	public void setSeason(PeriodOfYear season) {
		this.season = season;
	}
	public void setUnitWeight(Integer unitWeight) {
		this.unitWeight = unitWeight;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	

	@Override
	public String toString() {
		return name;
	}
}
