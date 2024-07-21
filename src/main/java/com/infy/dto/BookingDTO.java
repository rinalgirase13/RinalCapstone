package com.infy.dto;

import java.time.LocalDate;

public class BookingDTO {

private int bookingId;

private String userId;

private String  coachId;

private  LocalDate appointmentDate;

private char slot;


public int getBookingId() {
	return bookingId;
}

public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}

public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

public String getCoachId() {
	return coachId;
}

public void setCoachId(String coachId) {
	this.coachId = coachId;
}

public LocalDate getAppointmentDate() {
	return appointmentDate;
}

public void setAppointmentDate(LocalDate appointmentDate) {
	this.appointmentDate = appointmentDate;
}

public char getSlot() {
	return slot;
}

public void setSlot(char slot) {
	this.slot = slot;
}






}
