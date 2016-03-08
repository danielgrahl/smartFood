package de.grahl.smartFood.ingredient;

import java.time.Month;
import static java.time.Month.*;

public interface PeriodOfYear {

	public final static PeriodOfYear ALWAYS =
			new PeriodImplementation(JANUARY,DECEMBER);

	public boolean isSeason();
	
	public enum Season {
		WINTER("Winter",DECEMBER,MARCH),
		SPRING("Frühjahr",MARCH,JUNE),
		SUMMER("Sommer",JUNE,SEPTEMBER),
		FALL("Herbst",SEPTEMBER,DECEMBER);
		
		public final String name;
		/**
		 * Starting month of the season.
		 * The season starts at the first day of this month
		 * if meteorological seasons are considered.
		 */
		public final Month startMonth;
		/**
		 * End month of the season.
		 * For meteorological seasons, it ends on the day
		 * before the first day of that month
		 * (sometimes called 'day 0').
		 */
		public final Month endMonth;
		private Season (String s, Month sm, Month em) {
			name = s; startMonth = sm; endMonth = em;
		}
		public String toString() { return name; }
	}
}
