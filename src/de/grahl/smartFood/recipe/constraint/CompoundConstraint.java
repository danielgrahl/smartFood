package de.grahl.smartFood.recipe.constraint;

import java.util.Collection;

public abstract class CompoundConstraint<T> implements Constraint<T> {

	protected Collection<Constraint<? extends T>> components;
	
	// abstract implementation according to lambdas
}
