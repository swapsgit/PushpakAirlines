package com.airindiacustomer.booking;

public class TravelDocumentDetails {
	@Override
	public String toString() {
		return "TravelDocumentDetails [gender=" + gender + ", passportDetails=" + passportDetails + "]";
	}

	private GenderEnum gender;
	private PassportDetails passportDetails;

	public TravelDocumentDetails(GenderEnum gender, PassportDetails passportDetails) {
		super();
		this.gender = gender;
		this.passportDetails = passportDetails;
	}


}
