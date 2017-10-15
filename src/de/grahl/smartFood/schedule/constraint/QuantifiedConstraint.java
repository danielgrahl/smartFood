package de.grahl.smartFood.schedule.constraint;

import java.util.Map;

import de.grahl.smartFood.constraint.Constraint;
import de.grahl.smartFood.recipe.Recipe;
import de.grahl.smartFood.schedule.Schedule;

public interface QuantifiedConstraint extends Constraint< Schedule >
{
	public static QuantifiedConstraint forall( Contraint< Recipe > aRecipeConstraint )
	{
		return sched -> {
			for( Map.Entry< LocalDate, Recipe > entry : sched )
			{
				if( !aRecipeConstraint.check( entry.getValue() ))
				{
					return false; 
				}
				return true;
			}
		}
	}
}
