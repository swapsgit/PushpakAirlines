package airindia.official;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import com.airindiacustomer.base.BookingClass;

public class FlightsDetails {
	private String Flight_No;
	private String Origin;
	private String Destination;
	private LocalDateTime Scheduled_Departure;
	private LocalDateTime Scheduled_Arrival;
	private BookingClass Seat;
	private Integer seatCapacity;
	private Integer Price;


	public FlightsDetails(String flight_No, String origin, String destination, String scheduled_Departure,
			String scheduled_Arrival, BookingClass seat, Integer seatCapacity, Integer price) {
		super();
		Flight_No = flight_No;
		Origin = origin;
		Destination = destination;
		Scheduled_Departure = LocalDateTime.parse(scheduled_Departure, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		Scheduled_Arrival = LocalDateTime.parse(scheduled_Arrival, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		Seat = seat;
		this.seatCapacity = seatCapacity;
		Price = price;
	}



	public FlightsDetails(String flightNo) {
		Flight_No = flightNo;
	}

	public String getFlight_No() {
		return Flight_No;
	}



	public String getOrigin() {
		return Origin;
	}



	public String getDestination() {
		return Destination;
	}



	public LocalDateTime getScheduled_Departure() {
		return Scheduled_Departure;
	}



	public LocalDateTime getScheduled_Arrival() {
		return Scheduled_Arrival;
	}



	public BookingClass getSeat() {
		return Seat;
	}



	public Integer getSeatCapacity() {
		return seatCapacity;
	}



	public Integer getPrice() {
		return Price;
	}



	@Override
	public int hashCode() {
		return Objects.hash(Flight_No);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		FlightsDetails other = (FlightsDetails) obj;
		return Objects.equals(Flight_No.toUpperCase(), other.Flight_No.toUpperCase());
	}



	@Override
	public String toString() {
		return "FlightsBase [Flight_No=" + Flight_No + ", Origin=" + Origin + ", Destination=" + Destination
				+ ", Scheduled_Departure=" + Scheduled_Departure + ", Scheduled_Arrival=" + Scheduled_Arrival
				+ ", Seat=" + Seat + ", seatCapacity=" + seatCapacity + ", Price=" + Price + "]";
	}



}
