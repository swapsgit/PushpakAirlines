package com.airindiacustomer.validators;

import java.time.LocalDate;

import com.airindiacustomer.exceptions.InvalidDepartureDateException;
import com.airindiacustomer.exceptions.InvalidReturnDateException;
public class ReturnDateValidator {

	public static LocalDate validateDate(LocalDate departureDate, String rdate) {
		if(departureDate == null) {
			throw new InvalidDepartureDateException("Invalid Departure Date");
		}
		if(rdate == null)
			return null;
		else {
		LocalDate returnDate = LocalDate.parse(rdate);
		if(returnDate.isAfter(departureDate)) {
			return returnDate;
		}else {
			throw new InvalidReturnDateException("Return date must after Departure Date");
		}}
	}
}
