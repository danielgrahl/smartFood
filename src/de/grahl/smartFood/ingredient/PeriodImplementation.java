package de.grahl.smartFood.ingredient;

import java.io.Serializable;
import java.time.*;

/**
 * Implements seasons with the Java 8 Date & Time API.
 * So support for time zones, DST, leap years, etc.
 * @author Daniel Grahl
 *
 */
public class PeriodImplementation implements PeriodOfYear, Serializable {
	 
	// data ranges (inclusive)
	private MonthDay preSeasonStart;
	private MonthDay seasonStart;
	private MonthDay seasonEnd;
	private MonthDay postSeasonEnd;

	public PeriodImplementation (MonthDay start, MonthDay end) {
		if (start.equals(end))
			throw new IllegalArgumentException("Season cannot start and end at "+start);
		seasonStart = start;
		seasonEnd = end;
	}
	
	public PeriodImplementation (Month start, Month end) {
		seasonStart = MonthDay.of(start, 1);
		seasonEnd = MonthDay.of(end, end.length(true));
	}
	
	public PeriodImplementation(Season season) {
		this(season.startMonth, season.endMonth);
	}
	
	public PeriodImplementation (int startMonth, int endMonth) {
		this(Month.of(startMonth), Month.of(endMonth));
	}

	@Override
	public boolean isSeason() {
		MonthDay today = MonthDay.now();
		if (seasonStart.compareTo(seasonEnd) < 0) {
			// season does not wrap around year
			return (seasonStart.compareTo(today) <= 0 && today.compareTo(seasonEnd) <= 0);
		} else {
			// season starts at end of year and ends at start of next year
			return (seasonStart.compareTo(today) <= 0 || today.compareTo(seasonEnd) <= 0);
		}
	}
}
