package com.airindiacustomer.booking;

import java.time.LocalDate;

public class PassangerDetails {
	@Override
	public String toString() {
		return "PassangerDetails [title=" + title + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}

	private EnumTitle title;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;

	public PassangerDetails(EnumTitle title, String firstName, String lastName, LocalDate dateOfBirth) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}


}
