package com.resources;

import java.util.LinkedList;
import java.util.List;

import com.airindiacustomer.base.BookingClass;

import airindia.official.FlightsDetails;

public class FlightData {

	public static List<FlightsDetails> getData(List<FlightsDetails> li) {
		
		li.add(new FlightsDetails("AI101", "Delhi", "Mumbai", "2024-11-02 08:00", "2024-11-02 10:00", BookingClass.ECONOMY, 150, 4000));
		li.add(new FlightsDetails("AI102", "Mumbai", "Bangalore", "2024-11-03 09:00", "2024-11-03 11:30", BookingClass.BUSINESS, 120, 8000));
		li.add(new FlightsDetails("AI103", "Bangalore", "Delhi", "2024-11-04 10:00", "2024-11-04 12:30", BookingClass.FIRST, 100, 12000));
		li.add(new FlightsDetails("AI104", "Chennai", "Kolkata", "2024-11-05 11:00", "2024-11-05 13:30", BookingClass.PREMIUM_ECONOMY, 130, 6000));
		li.add(new FlightsDetails("AI105", "Hyderabad", "Delhi", "2024-11-06 12:00", "2024-11-06 14:30", BookingClass.ECONOMY, 150, 4000));
		li.add(new FlightsDetails("AI106", "Delhi", "Chennai", "2024-11-07 13:00", "2024-11-07 15:00", BookingClass.BUSINESS, 120, 8000));
		li.add(new FlightsDetails("AI107", "Mumbai", "Hyderabad", "2024-11-08 14:00", "2024-11-08 16:30", BookingClass.FIRST, 100, 12000));
		li.add(new FlightsDetails("AI108", "Bangalore", "Kolkata", "2024-11-09 15:00", "2024-11-09 17:30", BookingClass.PREMIUM_ECONOMY, 130, 6000));
		li.add(new FlightsDetails("AI109", "Chennai", "Delhi", "2024-11-10 16:00", "2024-11-10 18:30", BookingClass.ECONOMY, 150, 4000));
		li.add(new FlightsDetails("AI110", "Hyderabad", "Mumbai", "2024-11-11 17:00", "2024-11-11 19:30", BookingClass.BUSINESS, 120, 8000));
		li.add(new FlightsDetails("AI111", "Delhi", "Bangalore", "2024-11-12 18:00", "2024-11-12 20:00", BookingClass.FIRST, 100, 12000));
		li.add(new FlightsDetails("AI112", "Mumbai", "Kolkata", "2024-11-13 19:00", "2024-11-13 21:30", BookingClass.PREMIUM_ECONOMY, 130, 6000));
		li.add(new FlightsDetails("AI113", "Bangalore", "Chennai", "2024-11-14 20:00", "2024-11-14 22:30", BookingClass.ECONOMY, 150, 4000));
		li.add(new FlightsDetails("AI114", "Chennai", "Hyderabad", "2024-11-15 21:00", "2024-11-15 23:30", BookingClass.BUSINESS, 120, 8000));
		li.add(new FlightsDetails("AI115", "Hyderabad", "Delhi", "2024-11-16 22:00", "2024-11-17 00:30", BookingClass.FIRST, 100, 12000));
		li.add(new FlightsDetails("AI116", "Delhi", "Mumbai", "2024-11-17 08:00", "2024-11-17 10:00", BookingClass.PREMIUM_ECONOMY, 130, 6000));
		li.add(new FlightsDetails("AI117", "Mumbai", "Bangalore", "2024-11-18 09:00", "2024-11-18 11:30", BookingClass.ECONOMY, 150, 4000));
		li.add(new FlightsDetails("AI118", "Bangalore", "Delhi", "2024-11-19 10:00", "2024-11-19 12:30", BookingClass.BUSINESS, 120, 8000));
		li.add(new FlightsDetails("AI119", "Chennai", "Kolkata", "2024-11-20 11:00", "2024-11-20 13:30", BookingClass.FIRST, 100, 12000));
		li.add(new FlightsDetails("AI120", "Hyderabad", "Delhi", "2024-11-21 12:00", "2024-11-21 14:30", BookingClass.PREMIUM_ECONOMY, 130, 6000));
		li.add(new FlightsDetails("AI121", "Delhi", "Chennai", "2024-11-22 13:00", "2024-11-22 15:00", BookingClass.ECONOMY, 150, 4000));
		li.add(new FlightsDetails("AI122", "Mumbai", "Hyderabad", "2024-11-23 14:00", "2024-11-23 16:30", BookingClass.BUSINESS, 120, 8000));
		li.add(new FlightsDetails("AI123", "Bangalore", "Kolkata", "2024-11-24 15:00", "2024-11-24 17:30", BookingClass.FIRST, 100, 12000));
		li.add(new FlightsDetails("AI124", "Chennai", "Delhi", "2024-11-25 16:00", "2024-11-25 18:30", BookingClass.PREMIUM_ECONOMY, 130, 6000));
		li.add(new FlightsDetails("AI125", "Hyderabad", "Mumbai", "2024-11-26 17:00", "2024-11-26 19:30", BookingClass.ECONOMY, 150, 4000));
		li.add(new FlightsDetails("AI126", "Delhi", "Bangalore", "2024-11-27 18:00", "2024-11-27 20:00", BookingClass.BUSINESS, 120, 8000));
		li.add(new FlightsDetails("AI127", "Mumbai", "Kolkata", "2024-11-28 19:00", "2024-11-28 21:30", BookingClass.FIRST, 100, 12000));
		li.add(new FlightsDetails("AI128", "Bangalore", "Chennai", "2024-11-29 20:00", "2024-11-29 22:30", BookingClass.PREMIUM_ECONOMY, 130, 6000));
		li.add(new FlightsDetails("AI129", "Chennai", "Hyderabad", "2024-11-30 21:00", "2024-11-30 23:30", BookingClass.ECONOMY, 150, 4000));
		li.add(new FlightsDetails("AI130", "Hyderabad", "Delhi", "2024-12-01 22:00", "2024-12-02 00:30", BookingClass.BUSINESS, 120, 8000));
		li.add(new FlightsDetails("AI131", "Delhi", "Mumbai", "2024-12-02 08:00", "2024-12-02 10:00", BookingClass.FIRST, 100, 12000));
		li.add(new FlightsDetails("AI132", "Mumbai", "Bangalore", "2024-12-03 09:00", "2024-12-03 11:30", BookingClass.PREMIUM_ECONOMY, 130, 6000));
		li.add(new FlightsDetails("AI133", "Bangalore", "Delhi", "2024-12-04 10:00", "2024-12-04 12:30", BookingClass.ECONOMY, 150, 4000));
		li.add(new FlightsDetails("AI134", "Chennai", "Kolkata", "2024-12-05 11:00", "2024-12-05 13:30", BookingClass.BUSINESS, 120, 8000));
		li.add(new FlightsDetails("AI135", "Hyderabad", "Delhi", "2024-12-06 12:00", "2024-12-06 14:30", BookingClass.FIRST, 100, 12000));
		li.add(new FlightsDetails("AI136", "Delhi", "Chennai", "2024-12-07 13:00", "2024-12-07 15:00", BookingClass.PREMIUM_ECONOMY, 130, 6000));
		li.add(new FlightsDetails("AI137", "Mumbai", "Hyderabad", "2024-12-08 14:00", "2024-12-08 16:30", BookingClass.ECONOMY, 150, 4000));
		li.add(new FlightsDetails("AI138", "Bangalore", "Kolkata", "2024-12-09 15:00", "2024-12-09 17:30", BookingClass.BUSINESS, 120, 8000));
		li.add(new FlightsDetails("AI139", "Chennai", "Delhi", "2024-12-10 16:00", "2024-12-10 18:30", BookingClass.FIRST, 100, 12000));
		li.add(new FlightsDetails("AI140", "Hyderabad", "Mumbai", "2024-12-11 17:00", "2024-12-11 19:30", BookingClass.PREMIUM_ECONOMY, 130, 6000));

		return li;
	}

}
