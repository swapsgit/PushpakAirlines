package com.airIndia.tester;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.airindiacustomer.base.AirIndiaCustomerBase;
import com.airindiacustomer.base.GetMenu;
import com.airindiacustomer.booking.JourneyDetails;
import com.airindiacustomer.booking.MenuSelectFlight;
import com.resources.FlightData;
import com.resources.RequestData;
import com.resources.SearchFlightTestData;

import airindia.official.FlightsDetails;

public class AirIndiaHomeTester {
	static AirIndiaCustomerBase aib;
	static List<AirIndiaCustomerBase> custRequList;
	static List<FlightsDetails> flightList;
	static Map<String, JourneyDetails> map;
	public static void main(String[] args) {
		map = new HashMap<>();
		
		custRequList = new LinkedList<>();
		flightList = new LinkedList<>();
		flightList = FlightData.getData(flightList);
		map = RequestData.getData(map,flightList);
		custRequList = SearchFlightTestData.getData(custRequList);
		int choice = 0;
		try(Scanner sc = new Scanner(System.in)){
			do {
			GetMenu.displayHomeMenu();
			choice = sc.nextInt();
			switch(choice) {
			case 1:{
				int n = GetMenu.displaySearchFlights(sc, custRequList, flightList);

				System.out.println("Do you want to continue 1, 0 for exit");
				int temp = sc.nextInt();
				if(temp == 0)
					continue;
				if(n == 0)
					map = MenuSelectFlight.selectFlight(sc, flightList);
				
				
			}break;
			case 2:{
				sc.nextLine();
				System.out.println("Enter Booking reference number (PNR)*\r	(PNR is required)\r");
				String pnr = sc.nextLine();
//				System.out.println("Enter Last Name*\r(Last name is required)");
//				String lastName = sc.nextLine();
				System.out.println(map.get(pnr).toString());
				
				
			}break;
			case 3:{
				
			}break;
			case 4:{
				sc.nextLine();
				System.out.println("Please enter flight no");
				String flightNo = sc.nextLine();
				FlightsDetails fd = new FlightsDetails(flightNo);
				if(!flightList.contains(fd)) {
					System.err.println("Flight not found");
				}
				flightList.stream()
				.filter(a->a.getFlight_No().equalsIgnoreCase(flightNo))
				.forEach(System.out::println);
				
			}break;
			case 5:{
				for(String str : map.keySet()) {
					System.out.println(map.get(str).toString());
				}
			}break;
			default: {
				
			}break;
			}
			}while(choice != 0);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

}
