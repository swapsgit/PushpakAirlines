package com.airindiacustomer.booking;

import java.time.LocalDate;

public class PassportDetails {
	private String nationality;
	private String passportNumber;
	private LocalDate passportExpiry;
	private String passportIssueCountry;

	public PassportDetails(String nationality, String passportNumber, LocalDate passportExpiry,
			String passportIssueCountry) {
		super();
		this.nationality = nationality;
		this.passportNumber = passportNumber;
		this.passportExpiry = passportExpiry;
		this.passportIssueCountry = passportIssueCountry;
	}

	@Override
	public String toString() {
		return "PassportDetails [nationality=" + nationality + ", passportNumber=" + passportNumber
				+ ", passportExpiry=" + passportExpiry + ", passportIssueCountry=" + passportIssueCountry + "]";
	}




}
