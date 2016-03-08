package de.grahl.smartFood.recipe.constraint;

/**
 * Constraints for recipe schedules.
 * @author Daniel Grahl
 *
 */
public interface Constraint<T> {

	public int valuate (T t) ;
}
