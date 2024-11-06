package com.airindiacustomer.booking;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.airindiacustomer.validators.DateOfBirthValidator;
import com.airindiacustomer.validators.PassportExpiryValidator;

import airindia.official.FlightsDetails;

public class MenuSelectFlight {
	private static Map<String, JourneyDetails> map;
	public static Map<String, JourneyDetails> selectFlight(Scanner sc, List<FlightsDetails> list) {
		sc.nextLine();
		map = new HashMap<>();
		System.out.println("Please select a flight to continue");
		String flightNo = sc.nextLine();
		FlightsDetails selectedFlight = null;
		for (FlightsDetails fb : list) {
			if (fb.getFlight_No().equals(flightNo)) {
				selectedFlight = fb;
				break;
			}
		}
		if(selectedFlight == null) {
			System.err.println("Flight not found");
		}
		System.out.println("Please Enter Personal details");
		System.out.println("Enter title (Mr," + "	Mrs," + "	Ms," + "	Mstr," + "	Doctor," + "	Miss)");
		String title = sc.nextLine();
		System.out.println(" firstName");
		String firstName = sc.nextLine();
		System.out.println(" lastName");
		String lastName = sc.nextLine();
		System.out.println("dateOfBirth");
		LocalDate dateOfBirth = DateOfBirthValidator.validate(sc.nextLine());
		PassangerDetails pd = null;
		if (dateOfBirth != null)
			pd = new PassangerDetails(EnumTitle.valueOf(title), firstName, lastName, dateOfBirth);

		ContactDetails conDetails = null;
		System.out.println("Please enter contact details");
		System.out.println("Email id:");
		String emailId = sc.nextLine();
		System.out.println("Confirm Email: ");
		String confirmEmail = sc.nextLine();
		System.out.println("Country Code: ");
		String countryCode = sc.nextLine();
		System.out.println("Mobile number: ");
		String mobileNo = sc.nextLine();
		if (mobileNo.length() == 10)
			conDetails = new ContactDetails(emailId, confirmEmail, countryCode, mobileNo);

		TravelDocumentDetails tdd = null;
		System.out.println("Please enter travel documet details");
		System.out.println("Natinality ");
		String nationality = sc.nextLine();
		System.out.println("passportNumber ");
		String passportNumber = sc.nextLine();
		System.out.println("passportExpiry ");
		LocalDate passportExpiry = PassportExpiryValidator.validate(sc.nextLine());
		System.out.println("passportIssueCountry ");
		String passportIssueCountry = sc.nextLine();
		System.out.println("gender (Male,\r" + "	Female,\r" + "	Undisclosed)");
		GenderEnum gender = GenderEnum.valueOf(sc.nextLine());

		PassportDetails pdet = new PassportDetails(nationality, passportNumber, passportExpiry, passportIssueCountry);
		tdd = new TravelDocumentDetails(gender, pdet);

		JourneyDetails jd = new JourneyDetails(pd, tdd, conDetails, selectedFlight);
				map.put(jd.getJourneyId(), jd);
				
				System.out.println(map.get(jd.getJourneyId()).toString());
				System.out.println("Your reservation is done for flight no "+selectedFlight.getFlight_No());
		
				return map;

		

	}

}
