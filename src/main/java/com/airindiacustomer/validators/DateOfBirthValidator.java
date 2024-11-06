package com.airindiacustomer.validators;

import java.time.LocalDate;

public class DateOfBirthValidator {
	
	public static LocalDate validate(String date) {
		LocalDate tempDate = LocalDate.parse(date);
		if(tempDate.isBefore(LocalDate.now().minusYears(18))) {
			return tempDate;
		}else {
			System.err.println("Underage is your parents with you?");
		}
		
		return null;
	}

}
