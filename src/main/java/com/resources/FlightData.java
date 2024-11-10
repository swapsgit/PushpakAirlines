package com.resources;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.airindiacustomer.base.BookingClass;

import airindia.official.FlightsDetails;

public class FlightData {

	public static List<FlightsDetails> getData(List<FlightsDetails> li) {

		li.add(new FlightsDetails("AI101", "Delhi", "Mumbai", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), LocalDateTime.now().plusHours(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), BookingClass.ECONOMY, 150, 4000));
		li.add(new FlightsDetails("AI102", "Mumbai", "Bangalore", LocalDateTime.now().plusDays(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), LocalDateTime.now().plusDays(1).plusHours(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), BookingClass.BUSINESS, 120, 8000));
		li.add(new FlightsDetails("AI103", "Bangalore", "Delhi", LocalDateTime.now().plusDays(3).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), LocalDateTime.now().plusDays(3).plusHours(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), BookingClass.FIRST, 100, 12000));
		li.add(new FlightsDetails("AI104", "Chennai", "Kolkata", LocalDateTime.now().plusDays(4).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), LocalDateTime.now().plusDays(4).plusHours(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), BookingClass.PREMIUM_ECONOMY, 130, 6000));
		li.add(new FlightsDetails("AI105", "Hyderabad", "Delhi", LocalDateTime.now().plusDays(5).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), LocalDateTime.now().plusDays(5).plusHours(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), BookingClass.ECONOMY, 150, 4000));
		li.add(new FlightsDetails("AI106", "Delhi", "Chennai", LocalDateTime.now().plusDays(6).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), LocalDateTime.now().plusDays(6).plusHours(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), BookingClass.BUSINESS, 120, 8000));
		li.add(new FlightsDetails("AI107", "Mumbai", "Hyderabad", LocalDateTime.now().plusDays(7).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), LocalDateTime.now().plusDays(7).plusHours(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), BookingClass.FIRST, 100, 12000));
		li.add(new FlightsDetails("AI108", "Bangalore", "Kolkata", LocalDateTime.now().plusDays(8).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), LocalDateTime.now().plusDays(8).plusHours(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), BookingClass.PREMIUM_ECONOMY, 130, 6000));
		li.add(new FlightsDetails("AI109", "Chennai", "Delhi", LocalDateTime.now().plusDays(9).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), LocalDateTime.now().plusDays(9).plusHours(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), BookingClass.ECONOMY, 150, 4000));
		li.add(new FlightsDetails("AI110", "Hyderabad", "Mumbai", LocalDateTime.now().plusDays(10).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), LocalDateTime.now().plusDays(10).plusHours(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), BookingClass.BUSINESS, 120, 8000));
		li.add(new FlightsDetails("AI111", "Delhi", "Bangalore", LocalDateTime.now().plusDays(11).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), LocalDateTime.now().plusDays(11).plusHours(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), BookingClass.FIRST, 100, 12000));
		li.add(new FlightsDetails("AI112", "Mumbai", "Kolkata", LocalDateTime.now().plusDays(12).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), LocalDateTime.now().plusDays(12).plusHours(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), BookingClass.PREMIUM_ECONOMY, 130, 6000));
		li.add(new FlightsDetails("AI113", "Bangalore", "Chennai", LocalDateTime.now().plusDays(13).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), LocalDateTime.now().plusDays(13).plusHours(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), BookingClass.ECONOMY, 150, 4000));
		li.add(new FlightsDetails("AI114", "Chennai", "Hyderabad", LocalDateTime.now().plusDays(14).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), LocalDateTime.now().plusDays(14).plusHours(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), BookingClass.BUSINESS, 120, 8000));
		li.add(new FlightsDetails("AI115", "Hyderabad", "Delhi", LocalDateTime.now().plusDays(15).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), LocalDateTime.now().plusDays(15).plusHours(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), BookingClass.FIRST, 100, 12000));
		li.add(new FlightsDetails("AI116", "Delhi", "Mumbai", LocalDateTime.now().plusDays(16).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), LocalDateTime.now().plusDays(16).plusHours(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), BookingClass.PREMIUM_ECONOMY, 130, 6000));
		li.add(new FlightsDetails("AI117", "Mumbai", "Bangalore", LocalDateTime.now().plusDays(17).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), LocalDateTime.now().plusDays(17).plusHours(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(), BookingClass.ECONOMY, 150, 4000));

		li.add(new FlightsDetails("AI118", "Bangalore", "Delhi",
			    LocalDateTime.now().plusDays(18).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    LocalDateTime.now().plusDays(18).plusHours(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    BookingClass.ECONOMY, 150, 4000));

			li.add(new FlightsDetails("AI119", "Chennai", "Mumbai",
			    LocalDateTime.now().plusDays(19).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    LocalDateTime.now().plusDays(19).plusHours(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    BookingClass.BUSINESS, 120, 8000));

			li.add(new FlightsDetails("AI120", "Hyderabad", "Kolkata",
			    LocalDateTime.now().plusDays(20).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    LocalDateTime.now().plusDays(20).plusHours(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    BookingClass.PREMIUM_ECONOMY, 130, 6000));

			li.add(new FlightsDetails("AI121", "Delhi", "Singapore",
			    LocalDateTime.now().plusDays(21).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    LocalDateTime.now().plusDays(21).plusHours(4).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    BookingClass.ECONOMY, 180, 12000)); // International Flight

			li.add(new FlightsDetails("AI122", "Mumbai", "London",
			    LocalDateTime.now().plusDays(22).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    LocalDateTime.now().plusDays(22).plusHours(7).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    BookingClass.FIRST, 90, 25000)); // International Flight

			li.add(new FlightsDetails("AI123", "Bangalore", "Dubai",
			    LocalDateTime.now().plusDays(23).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    LocalDateTime.now().plusDays(23).plusHours(5).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    BookingClass.BUSINESS, 100, 15000)); // International Flight

			li.add(new FlightsDetails("AI124", "Chennai", "New York",
			    LocalDateTime.now().plusDays(24).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    LocalDateTime.now().plusDays(24).plusHours(8).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    BookingClass.FIRST, 80, 35000)); // International Flight

			li.add(new FlightsDetails("AI125", "Delhi", "Sydney",
			    LocalDateTime.now().plusDays(25).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    LocalDateTime.now().plusDays(25).plusHours(9).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    BookingClass.PREMIUM_ECONOMY, 110, 22000)); // International Flight

			li.add(new FlightsDetails("AI126", "Mumbai", "Tokyo",
			    LocalDateTime.now().plusDays(26).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    LocalDateTime.now().plusDays(26).plusHours(6).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    BookingClass.ECONOMY, 130, 18000)); // International Flight

			li.add(new FlightsDetails("AI127", "Bangalore", "Paris",
			    LocalDateTime.now().plusDays(27).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    LocalDateTime.now().plusDays(27).plusHours(7).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    BookingClass.BUSINESS, 100, 20000)); // International Flight

			li.add(new FlightsDetails("AI128", "Hyderabad", "Hong Kong",
			    LocalDateTime.now().plusDays(28).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    LocalDateTime.now().plusDays(28).plusHours(5).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    BookingClass.FIRST, 90, 24000)); // International Flight

			li.add(new FlightsDetails("AI129", "Delhi", "Toronto",
			    LocalDateTime.now().plusDays(29).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    LocalDateTime.now().plusDays(29).plusHours(10).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    BookingClass.PREMIUM_ECONOMY, 80, 28000)); // International Flight

			li.add(new FlightsDetails("AI130", "Chennai", "Frankfurt",
			    LocalDateTime.now().plusDays(30).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    LocalDateTime.now().plusDays(30).plusHours(8).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString(),
			    BookingClass.ECONOMY, 150, 17000)); // International Flight

		return li;
	}

}
