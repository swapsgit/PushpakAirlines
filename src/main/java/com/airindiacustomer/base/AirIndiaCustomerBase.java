package com.airindiacustomer.base;

import java.time.LocalDate;

public class AirIndiaCustomerBase {
	private String start;
	private String destination;
	private LocalDate departureDate;
	private LocalDate returnDate;
	private int passengers;
	private BookingClass bookingClass;
	private PaymentMethod payBy;
	private ConcessionType concessionType;
	
	public AirIndiaCustomerBase(String start, String destination, LocalDate departureDate, LocalDate returnDate, int passengers,
			BookingClass bookingClass, PaymentMethod payBy, ConcessionType concessionType) {
		super();
		this.start = start;
		this.destination = destination;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.passengers = passengers;
		this.bookingClass = bookingClass;
		this.payBy = payBy;
		this.concessionType = concessionType;
	}
	
	@Override
	public String toString() {
		return "AirIndiaBase [start=" + start + ", destination=" + destination + ", departureDate=" + departureDate
				+ ", returnDate=" + returnDate + ", passengers=" + passengers + ", bookingClass=" + bookingClass
				+ ", payBy=" + payBy + ", concessionType=" + concessionType + "]";
	}
	
	
	
}
