package com.airindiacustomer.validators;

import com.airindiacustomer.base.ConcessionType;

public class ConcessionTypeValidator {
	
	public static ConcessionType validateConcession(String entType) {
		if(entType.isEmpty()) {
			System.err.println("Please enter Valid ConcessionType");
		}
		
		
		return ConcessionType.valueOf(entType.toUpperCase());				
	}

}
