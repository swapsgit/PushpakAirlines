package com.airindiacustomer.base;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.airindiacustomer.validators.BookingClassValidator;
import com.airindiacustomer.validators.ConcessionTypeValidator;
import com.airindiacustomer.validators.DepartureDateValidator;
import com.airindiacustomer.validators.PaymentMethodValidator;
import com.airindiacustomer.validators.ReturnDateValidator;

import airindia.official.FlightsDetails;

public class GetMenu {
	public static void displayHomeMenu() {
		System.out.println("******************************");
		System.out.println("*    Welcome to Air India    *");
		System.out.println("******************************\n" + "*    Please Enter            *\n"
				+ "*----------------------------*\n" + "* 1. SEARCH FLIGHTS          *\r\n"

				+ "* 2. MANAGE BOOKING          *\r\n"

				+ "* 3. CHECK IN                *\r\n"

				+ "* 4. FLIGHT STATUS           *\n" + "* 0. To exit                 *\n"
				+ "******************************");

	}

	public static int displaySearchFlights(Scanner sc, List<AirIndiaCustomerBase> aib, List<FlightsDetails> fib) {
		sc.nextLine();

		LocalDate tempDepartureDate = null;
		LocalDate returnDate = null;
		System.out.println("Please enter starting point");
		String start = sc.nextLine();
		System.out.println("Please enter destination");
		String destination = sc.nextLine();
		System.out.println("1. One way journey\n2. Two way journey");
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1: {
			System.out.println("Please enter departureDate");
			tempDepartureDate = DepartureDateValidator.validateDate(sc.nextLine());
		}
			break;
		case 2: {
			System.out.println("Please enter departureDate");
			tempDepartureDate = DepartureDateValidator.validateDate(sc.nextLine());
			System.out.println("Please enter returnDate");
			returnDate = ReturnDateValidator.validateDate(tempDepartureDate, sc.nextLine());
		}
			break;
		}
		final LocalDate departureDate = tempDepartureDate;
		System.out.println("Press 1 to fill more details or 0 to see available flights");
		int temp = sc.nextInt();
		if(temp == 1) {
		System.out.println("Please enter passengers");
		int passengers = sc.nextInt();
		sc.nextLine();
		System.out.println(
				"Please enter booking Class (Economy,\r" + "	Premium_Economy,\r" + "	Business,\r" + "	First)");
		BookingClass bookingClass = BookingClassValidator.validateClass(sc.nextLine().toUpperCase());
		System.out.println("Please enter payment method (CASH,\r" + "	CASH_POINTS,\r" + "	POINTS)");
		PaymentMethod payBy = PaymentMethod.valueOf("CASH");

		payBy = PaymentMethodValidator.validatePaymet(sc.nextLine());
		System.out.println(
				"Please enter concession Type (NONE,\r" + "	STUDENT,\r" + "	SENIOR_CITIZEN,\r" + "	ARMED_FORCES)");

		ConcessionType concessionType = ConcessionType.valueOf("NONE");
		concessionType = ConcessionTypeValidator.validateConcession(sc.nextLine());
		if (departureDate == null)
			return -1;
		AirIndiaCustomerBase alb = new AirIndiaCustomerBase(start, destination, departureDate, returnDate, passengers,
				bookingClass, payBy, concessionType);
		aib.add(alb);
		}
		List<FlightsDetails> lif = fib.stream().filter(a -> a.getOrigin().equalsIgnoreCase(start))
				.filter(a -> a.getDestination().equalsIgnoreCase(destination))
				.filter(a -> a.getScheduled_Departure().equals(departureDate.atStartOfDay()) || a.getScheduled_Departure().toLocalDate().isAfter(LocalDate.now()))
				.collect(Collectors.toList());

		if (lif.isEmpty()) {
			System.out.println("No Flight Available");
			return -1;
		}

		lif.forEach(System.out::println);
		return 0;

	}


}
