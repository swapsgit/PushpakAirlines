package com.airindiacustomer.validators;

import com.airindiacustomer.base.PaymentMethod;

public class PaymentMethodValidator {
	
	public static PaymentMethod validatePaymet(String entPayMethod) {
		if(entPayMethod.isEmpty()) {
			System.err.println("Please enter Valid paymentMethod");
		}
		
		return PaymentMethod.valueOf(entPayMethod.toUpperCase());				
	}

}
