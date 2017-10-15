package de.grahl.smartFood.constraint;

import java.util.Collection;

/**
 * Conjunction over several constraints.
 * @author daniel
 *
 * @param <T>
 */
public final class CompoundConstraint< T extends Constrainable > implements Constraint<T> {

	protected Collection<Constraint<? super T>> components;
	
	@Override
	public boolean check( T aConstrainable )
	{
		for( Constraint<? super T> cc : components )
		{
			if( !cc.check(aConstrainable))
			{
				return false;
			}
		}
		return true;
	}
}
