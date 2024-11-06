package com.airindiacustomer.booking;

public class ContactDetails {
	private String emailId;
	private String confirmEmail;
	private String countryCode;
	private String mobileNo;
	
	public ContactDetails(String emailId, String confirmEmail, String countryCode, String mobileNo) {
		super();
		this.emailId = emailId;
		this.confirmEmail = confirmEmail;
		this.countryCode = countryCode;
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "ContactDetails [emailId=" + emailId + ", confirmEmail=" + confirmEmail + ", countryCode=" + countryCode
				+ ", mobileNo=" + mobileNo + "]";
	}
	
	
}
