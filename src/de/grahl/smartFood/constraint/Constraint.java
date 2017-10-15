package de.grahl.smartFood.constraint;

/**
 * Constraints for recipe schedules.
 * @author Daniel Grahl
 *
 */
@FunctionalInterface
public interface Constraint< T extends Constrainable > 
{

	public boolean check( T aConstrainable );
	
}
