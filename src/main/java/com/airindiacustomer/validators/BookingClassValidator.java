package com.airindiacustomer.validators;

import com.airindiacustomer.base.BookingClass;

public class BookingClassValidator {

	public static BookingClass validateClass(String entClass) {
		if(entClass.isEmpty()) {
			System.err.println("Please enter Valid class");
		}

		return BookingClass.valueOf(entClass.toUpperCase());
	}

}
