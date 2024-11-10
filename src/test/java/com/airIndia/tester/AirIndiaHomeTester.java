package com.airIndia.tester;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.airindiacustomer.base.AirIndiaCustomerBase;
import com.airindiacustomer.base.GetMenu;
import com.airindiacustomer.booking.JourneyDetails;
import com.airindiacustomer.booking.MenuSelectFlight;
import com.airindiacustomer.validators.DepartureDateValidator;
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
		map = new HashMap<String, JourneyDetails>();

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
				int temp = 0,n = 0;
				System.out.println("Search flight 0, Book flight 1");
				int m = sc.nextInt();
				if(m == 0) {
				n = GetMenu.displaySearchFlights(sc, custRequList, flightList);

				System.out.println("Do you want to continue 1, 0 for exit");
				temp = sc.nextInt();

				if(temp == 0)
					continue;
				}
				if(n == 0)
					map = MenuSelectFlight.selectFlight(sc, flightList, map);


			}break;
			case 2:{
				sc.nextLine();
				System.out.println("Enter Booking reference number (PNR)*\r	(PNR is required)\r");
				String pnr = sc.nextLine().toUpperCase();
//				System.out.println("Enter Last Name*\r(Last name is required)");
//				String lastName = sc.nextLine();
				System.out.println(map.get(pnr).toString());
				System.out.println("1. Cancel your booking");
				System.out.println("2. Change Flight");
				int n = sc.nextInt();
				if(n == 1) {
					System.out.println("Are You sure 0 Yes /1 No");
					if(sc.nextInt() == 0)
					map.remove(pnr);
				}
				int k=0;
				if(n == 2) {
					
					k = GetMenu.displaySearchFlights(sc, custRequList, flightList);
					sc.nextLine();
					System.out.println("Enter flight no to proceed");
					String flightNo = sc.nextLine();
					JourneyDetails jd = map.get(pnr);
					if(k == -1)
						return;
					map.remove(pnr);
					map.put(flightNo, jd);
					System.out.println("Flight details updated");
				}
				
				

			}break;
			case 3:{
				System.out.println("For Check in press 0");
				int n = sc.nextInt();
				if(n != 0)
					return;
				sc.nextLine();
				System.out.println("Enter Booking reference number to chek in");
				String pnr = sc.nextLine().toUpperCase();
				if(map.containsKey(pnr)) {
					for(FlightsDetails f : flightList) {
						if(f.getFlight_No().equals(pnr)) {
							System.out.println("Your flight will be depart shortly");
							System.out.println("Meanwhile enjoy our services");
							return;
						}
					}
					
				}
					System.err.println("Flight not found");
				
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
