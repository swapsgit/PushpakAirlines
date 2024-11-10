package com.airindiacustomer.validators;

import java.time.LocalDate;

public class PassportExpiryValidator {

	public static LocalDate validate(String date) {
		LocalDate tempDate = LocalDate.parse(date);
		if(tempDate.isAfter(LocalDate.now().plusWeeks(1))) {
			return tempDate;
		}else if(tempDate.isBefore(LocalDate.now())) {
			System.err.println("Please renew your password to continue journey");
		}

		return null;
	}

}
