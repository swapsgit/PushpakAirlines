package com.resources;

import java.time.LocalDate;
import java.util.List;

import com.airindiacustomer.base.AirIndiaCustomerBase;
import com.airindiacustomer.validators.BookingClassValidator;
import com.airindiacustomer.validators.ConcessionTypeValidator;
import com.airindiacustomer.validators.DepartureDateValidator;
import com.airindiacustomer.validators.PaymentMethodValidator;
import com.airindiacustomer.validators.ReturnDateValidator;

public class SearchFlightTestData {

	public static List<AirIndiaCustomerBase> getData(List<AirIndiaCustomerBase> list){
		list.add(new AirIndiaCustomerBase( "Mumbai",  "Dubai",  DepartureDateValidator.validateDate(LocalDate.now().plusDays(1).toString()),  ReturnDateValidator.validateDate(DepartureDateValidator.validateDate(LocalDate.now().plusDays(1).toString()),LocalDate.now().plusDays(2).toString()),  4,
				BookingClassValidator.validateClass( "FIRST"),  PaymentMethodValidator.validatePaymet("CASH"), ConcessionTypeValidator.validateConcession ("NONE")));
		list.add(new AirIndiaCustomerBase( "Bangalore",  "Pune",  DepartureDateValidator.validateDate(LocalDate.now().plusDays(1).toString()),  ReturnDateValidator.validateDate(DepartureDateValidator.validateDate(LocalDate.now().plusDays(1).toString()),LocalDate.now().plusDays(2).toString()),  4,
				BookingClassValidator.validateClass("FIRST"),  PaymentMethodValidator.validatePaymet("CASH"), ConcessionTypeValidator.validateConcession ("NONE")));
		list.add(new AirIndiaCustomerBase( "Mumbai",  "Thailand",  DepartureDateValidator.validateDate(LocalDate.now().plusDays(1).toString()),  ReturnDateValidator.validateDate(DepartureDateValidator.validateDate(LocalDate.now().plusDays(1).toString()),LocalDate.now().plusDays(2).toString()),  4,
				BookingClassValidator.validateClass("FIRST"),  PaymentMethodValidator.validatePaymet("CASH"), ConcessionTypeValidator.validateConcession ("NONE")));
		list.add(new AirIndiaCustomerBase( "Dubai",  "NewYork",  DepartureDateValidator.validateDate(LocalDate.now().plusDays(1).toString()),  ReturnDateValidator.validateDate(DepartureDateValidator.validateDate(LocalDate.now().plusDays(1).toString()),LocalDate.now().plusDays(2).toString()),  4,
				BookingClassValidator.validateClass("FIRST"),  PaymentMethodValidator.validatePaymet("CASH"), ConcessionTypeValidator.validateConcession ("NONE")));
		list.add(new AirIndiaCustomerBase( "Amritsar",  "Canada",  DepartureDateValidator.validateDate(LocalDate.now().plusDays(1).toString()),  ReturnDateValidator.validateDate(DepartureDateValidator.validateDate(LocalDate.now().plusDays(1).toString()),LocalDate.now().plusDays(2).toString()),  4,
				BookingClassValidator.validateClass("FIRST"), PaymentMethodValidator.validatePaymet("CASH"), ConcessionTypeValidator.validateConcession("NONE")));
		list.add(new AirIndiaCustomerBase( "Bangalore",  "Washington",  DepartureDateValidator.validateDate(LocalDate.now().plusDays(1).toString()),  ReturnDateValidator.validateDate(DepartureDateValidator.validateDate(LocalDate.now().plusDays(1).toString()),LocalDate.now().plusDays(2).toString()),  4,
				BookingClassValidator.validateClass("FIRST"),  PaymentMethodValidator.validatePaymet("CASH"), ConcessionTypeValidator.validateConcession ("NONE")));
		list.add(new AirIndiaCustomerBase( "Tirupati",  "Kolhapur",  DepartureDateValidator.validateDate(LocalDate.now().plusDays(1).toString()),  ReturnDateValidator.validateDate(DepartureDateValidator.validateDate(LocalDate.now().plusDays(1).toString()),LocalDate.now().plusDays(2).toString()),  4,
				BookingClassValidator.validateClass("FIRST"),  PaymentMethodValidator.validatePaymet("CASH"), ConcessionTypeValidator.validateConcession ("NONE")));
	return list;
	}

}
