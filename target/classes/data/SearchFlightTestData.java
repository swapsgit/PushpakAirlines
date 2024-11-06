package data;

import com.airindia.base.AirIndiaBase;

public class SearchFlightTestData {
	
	public static List<AirIndiaBase> getData(List<AirIndiaBase> list){
		list.add(new AirIndiaBase( "Mumbai",  "Dubai",  "2024-11-01",  "2024-11-15",  4,
				 "FIRST",  "CASH",  "NONE"));
		list.add(new AirIndiaBase( "Bangalore",  "Pune",  "2024-11-01",  "2024-11-15",  4,
				"FIRST",  "CASH",  "NONE"));
		list.add(new AirIndiaBase( "Mumbai",  "Thailand",  "2024-11-01",  "2024-11-15",  4,
				"FIRST",  "CASH",  "NONE"));
		list.add(new AirIndiaBase( "Dubai",  "NewYork",  "2024-11-01",  "2024-11-15",  4,
				"FIRST",  "CASH",  "NONE"));
		list.add(new AirIndiaBase( "Amritsar",  "Canada",  "2024-11-01",  "2024-11-15",  4,
				"FIRST", "CASH", "NONE"));
		list.add(new AirIndiaBase( "Bangalore",  "Washington",  "2024-11-01",  "2024-11-15",  4,
				"FIRST",  "CASH",  "NONE"));
		list.add(new AirIndiaBase( "Tirupati",  "Kolhapur",  "2024-11-01",  "2024-11-15",  4,
				"FIRST",  "CASH",  "NONE"));
	}

}
