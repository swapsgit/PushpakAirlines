package com.airindiacustomer.validators;

import java.time.LocalDate;

import com.airindiacustomer.exceptions.InvalidDepartureDateException;

public class DepartureDateValidator {
	
	public static LocalDate validateDate(String date) {
		LocalDate enteredDate = LocalDate.parse(date);
		if(enteredDate.isAfter(LocalDate.now().minusDays(1)))
		return enteredDate;
		else {
			throw new InvalidDepartureDateException("Departure date is must after current date");
		}
		
	}

}
