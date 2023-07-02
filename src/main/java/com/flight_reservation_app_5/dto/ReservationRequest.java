package com.flight_reservation_app_5.dto;

public class ReservationRequest {
	private long flightId;
	private String firstName;
	private String lastName;
	private String middleName;
	private String email;
	private String phone;
	private String cardNumber;
	private String cardHolderName;
	private String expirationaDate;
	private String cvvcode;
	
	
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getExpirationaDate() {
		return expirationaDate;
	}
	public void setExpirationaDate(String expirationaDate) {
		this.expirationaDate = expirationaDate;
	}
	public String getCvvcode() {
		return cvvcode;
	}
	public void setCvvcode(String cvvcode) {
		this.cvvcode = cvvcode;
	}
	public long getFlightId() {
		return flightId;
	}
	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}


}
