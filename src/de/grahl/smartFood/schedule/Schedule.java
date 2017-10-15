package de.grahl.smartFood.schedule;

import java.time.LocalDate;
import java.util.Map;

import de.grahl.smartFood.constraint.Constrainable;
import de.grahl.smartFood.recipe.Recipe;

/**
 * A schedule maps a {@link Recipe} to a day within its range.
 * Schedules range over several days (without holes).
 * @author daniel
 *
 */
public interface Schedule 
extends Iterable< Map.Entry< LocalDate, Recipe >>, Constrainable
{

}
