package com.airindiacustomer.booking;

import airindia.official.FlightsDetails;
public class JourneyDetails {
	private static int startId = 1001;
	private String journeyId;
	private PassangerDetails pd;
	private TravelDocumentDetails tdd;
	private ContactDetails conDetails;
	private FlightsDetails flight;

	public JourneyDetails(PassangerDetails pd, TravelDocumentDetails tdd, ContactDetails conDetails,FlightsDetails flight) {
		super();
		this.journeyId = "AI"+String.valueOf(startId++);
		this.pd = pd;
		this.tdd = tdd;
		this.conDetails = conDetails;
		this.flight = flight;


	}

	public String getJourneyId() {
		return journeyId;
	}

	@Override
	public String toString() {
		return "JourneyDetails [journeyId=" + journeyId + ", pd=" + pd + ", tdd=" + tdd + ", conDetails=" + conDetails
				+ ", flight=" + flight + "]";
	}

}
