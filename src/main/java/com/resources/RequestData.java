package com.resources;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.airindiacustomer.booking.ContactDetails;
import com.airindiacustomer.booking.EnumTitle;
import com.airindiacustomer.booking.GenderEnum;
import com.airindiacustomer.booking.JourneyDetails;
import com.airindiacustomer.booking.PassangerDetails;
import com.airindiacustomer.booking.PassportDetails;
import com.airindiacustomer.booking.TravelDocumentDetails;

import airindia.official.FlightsDetails;

public class RequestData {

	public static Map<String, JourneyDetails> getData(Map<String, JourneyDetails> map, List<FlightsDetails> list) {
		map.put(
			    new JourneyDetails(
			        new PassangerDetails(EnumTitle.valueOf("MR"), "John", "Doe", LocalDate.parse("1990-01-01")),
			        new TravelDocumentDetails(GenderEnum.valueOf("Male"), new PassportDetails("US", "123456789", LocalDate.parse("2030-12-31"), "US")),
			        new ContactDetails("john.doe@example.com", "john.doe@example.com", "+1", "1234567890"),
			        list.get(list.indexOf(new FlightsDetails("AI114")))
			        ).getJourneyId(),
			    new JourneyDetails(
			        new PassangerDetails(EnumTitle.valueOf("MR"), "John", "Doe", LocalDate.parse("1990-01-01")),
			        new TravelDocumentDetails(GenderEnum.valueOf("Male"), new PassportDetails("US", "123456789", LocalDate.parse("2030-12-31"), "US")),
			        new ContactDetails("john.doe@example.com", "john.doe@example.com", "+1", "1234567890"),
			        list.get(list.indexOf(new FlightsDetails("AI114")))


			    )
			);

			map.put(
			    new JourneyDetails(
			        new PassangerDetails(EnumTitle.valueOf("MRS"), "Jane", "Smith", LocalDate.parse("1985-02-14")),
			        new TravelDocumentDetails(GenderEnum.valueOf("Female"), new PassportDetails("UK", "987654321", LocalDate.parse("2028-08-22"), "UK")),
			        new ContactDetails("jane.smith@example.com", "jane.smith@example.com", "+44", "987654321"),
			        list.get(list.indexOf(new FlightsDetails("AI115")))
			    ).getJourneyId(),
			    new JourneyDetails(
			        new PassangerDetails(EnumTitle.valueOf("MRS"), "Jane", "Smith", LocalDate.parse("1985-02-14")),
			        new TravelDocumentDetails(GenderEnum.valueOf("Female"), new PassportDetails("UK", "987654321", LocalDate.parse("2028-08-22"), "UK")),
			        new ContactDetails("jane.smith@example.com", "jane.smith@example.com", "+44", "987654321"),
			        list.get(list.indexOf(new FlightsDetails("AI115")))
			    )
			);

			map.put(
			    new JourneyDetails(
			        new PassangerDetails(EnumTitle.valueOf("MR"), "Michael", "Johnson", LocalDate.parse("1992-07-30")),
			        new TravelDocumentDetails(GenderEnum.valueOf("Male"), new PassportDetails("Canada", "112233445", LocalDate.parse("2035-05-12"), "Canada")),
			        new ContactDetails("michael.johnson@example.com", "michael.johnson@example.com", "+1", "234567890"),
			        list.get(list.indexOf(new FlightsDetails("AI116")))
			    ).getJourneyId(),
			    new JourneyDetails(
			        new PassangerDetails(EnumTitle.valueOf("MR"), "Michael", "Johnson", LocalDate.parse("1992-07-30")),
			        new TravelDocumentDetails(GenderEnum.valueOf("Male"), new PassportDetails("Canada", "112233445", LocalDate.parse("2035-05-12"), "Canada")),
			        new ContactDetails("michael.johnson@example.com", "michael.johnson@example.com", "+1", "234567890"),
			        list.get(list.indexOf(new FlightsDetails("AI116")))
			    )
			);

			map.put(
			    new JourneyDetails(
			        new PassangerDetails(EnumTitle.valueOf("MR"), "David", "Lee", LocalDate.parse("1988-11-05")),
			        new TravelDocumentDetails(GenderEnum.valueOf("Male"), new PassportDetails("Australia", "223344556", LocalDate.parse("2032-09-25"), "Australia")),
			        new ContactDetails("david.lee@example.com", "david.lee@example.com", "+61", "345678901"),
			        list.get(list.indexOf(new FlightsDetails("AI117")))
			    ).getJourneyId(),
			    new JourneyDetails(
			        new PassangerDetails(EnumTitle.valueOf("MR"), "David", "Lee", LocalDate.parse("1988-11-05")),
			        new TravelDocumentDetails(GenderEnum.valueOf("Male"), new PassportDetails("Australia", "223344556",LocalDate.parse( "2032-09-25"), "Australia")),
			        new ContactDetails("david.lee@example.com", "david.lee@example.com", "+61", "345678901"),
			        list.get(list.indexOf(new FlightsDetails("AI117") ) )
			    )
			);

			map.put(
			    new JourneyDetails(
			        new PassangerDetails(EnumTitle.valueOf("MRS"), "Emily", "Williams", LocalDate.parse("1995-04-21")),
			        new TravelDocumentDetails(GenderEnum.valueOf("Female"), new PassportDetails("India", "334455667", LocalDate.parse("2030-02-15"), "India")),
			        new ContactDetails("emily.williams@example.com", "emily.williams@example.com", "+91", "456789012"),
			        list.get(list.indexOf(new FlightsDetails("AI118")))
			    ).getJourneyId(),
			    new JourneyDetails(
			        new PassangerDetails(EnumTitle.valueOf("MRS"), "Emily", "Williams", LocalDate.parse("1995-04-21")),
			        new TravelDocumentDetails(GenderEnum.valueOf("Female"), new PassportDetails("India", "334455667", LocalDate.parse("2030-02-15"), "India")),
			        new ContactDetails("emily.williams@example.com", "emily.williams@example.com", "+91", "456789012"),
			        list.get(list.indexOf( new FlightsDetails("AI118")))
			    )
			);

			map.put(
			    new JourneyDetails(
			        new PassangerDetails(EnumTitle.valueOf("MR"), "Chris", "Davis", LocalDate.parse("1993-09-10")),
			        new TravelDocumentDetails(GenderEnum.valueOf("Male"), new PassportDetails("Germany", "445566778", LocalDate.parse("2029-01-30"), "Germany")),
			        new ContactDetails("chris.davis@example.com", "chris.davis@example.com", "+49", "567890123"),
			        list.get(list.indexOf(new FlightsDetails("AI119")))
			    ).getJourneyId(),
			    new JourneyDetails(
			        new PassangerDetails(EnumTitle.valueOf("MR"), "Chris", "Davis", LocalDate.parse("1993-09-10")),
			        new TravelDocumentDetails(GenderEnum.valueOf("Male"), new PassportDetails("Germany", "445566778", LocalDate.parse("2029-01-30"), "Germany")),
			        new ContactDetails("chris.davis@example.com", "chris.davis@example.com", "+49", "567890123"),
			        list.get(list.indexOf(new FlightsDetails("AI119")))
			    )
			);

			map.put(
			    new JourneyDetails(
			        new PassangerDetails(EnumTitle.valueOf("MRS"), "Sophia", "Martinez", LocalDate.parse("1986-03-17")),
			        new TravelDocumentDetails(GenderEnum.valueOf("Female"), new PassportDetails("Spain", "556677889", LocalDate.parse("2033-11-19"), "Spain")),
			        new ContactDetails("sophia.martinez@example.com", "sophia.martinez@example.com", "+34", "678901234"),
			        list.get(list.indexOf(new FlightsDetails("AI120")))
			    ).getJourneyId(),
			    new JourneyDetails(
			        new PassangerDetails(EnumTitle.valueOf("MRS"), "Sophia", "Martinez", LocalDate.parse("1986-03-17")),
			        new TravelDocumentDetails(GenderEnum.valueOf("Female"), new PassportDetails("Spain", "556677889", LocalDate.parse("2033-11-19"), "Spain")),
			        new ContactDetails("sophia.martinez@example.com", "sophia.martinez@example.com", "+34", "678901234"),
			        list.get(list.indexOf(new FlightsDetails("AI120")))
			    )
			);

			map.put(
			    new JourneyDetails(
			        new PassangerDetails(EnumTitle.valueOf("MR"), "Liam", "Miller", LocalDate.parse("1998-12-25")),
			        new TravelDocumentDetails(GenderEnum.valueOf("Male"), new PassportDetails("France", "667788990", LocalDate.parse("2036-03-05"), "France")),
			        new ContactDetails("liam.miller@example.com", "liam.miller@example.com", "+33", "789012345"),
			        list.get(list.indexOf(new FlightsDetails("AI121")))			    ).getJourneyId(),
			    new JourneyDetails(
			        new PassangerDetails(EnumTitle.valueOf("MR"), "Liam", "Miller", LocalDate.parse("1998-12-25")),
			        new TravelDocumentDetails(GenderEnum.valueOf("Male"), new PassportDetails("France", "667788990", LocalDate.parse("2036-03-05"), "France")),
			        new ContactDetails("liam.miller@example.com", "liam.miller@example.com", "+33", "789012345"),
			        list.get(list.indexOf(new FlightsDetails("AI121")))			    )
			);

			map.put(
			    new JourneyDetails(
			        new PassangerDetails(EnumTitle.valueOf("MRS"), "Olivia", "Taylor", LocalDate.parse("1999-08-15")),
			        new TravelDocumentDetails(GenderEnum.valueOf("Female"), new PassportDetails("Italy", "778899001", LocalDate.parse("2027-06-10"), "Italy")),
			        new ContactDetails("olivia.taylor@example.com", "olivia.taylor@example.com", "+39", "890123456"),
			        list.get(list.indexOf(new FlightsDetails("AI122")))			    ).getJourneyId(),
			    new JourneyDetails(
			        new PassangerDetails(EnumTitle.valueOf("MRS"), "Olivia", "Taylor", LocalDate.parse("1999-08-15")),
			        new TravelDocumentDetails(GenderEnum.valueOf("Female"), new PassportDetails("Italy", "778899001", LocalDate.parse("2027-06-10"), "Italy")),
			        new ContactDetails("olivia.taylor@example.com", "olivia.taylor@example.com", "+39", "890123456"),
			        list.get(list.indexOf(new FlightsDetails("AI122")))			    )
			);
			return map;
	}
}
