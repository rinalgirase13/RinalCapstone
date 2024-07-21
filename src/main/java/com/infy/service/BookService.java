package com.infy.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.infy.dto.BookingDTO;

@Service
public class BookService {

	
public boolean bookAppointment(String userId, String coachId, LocalDate appointmentDate, String slot) {
	
	
	return false;
}

public  boolean rescheduleAppointment(Integer bookingId, LocalDate appointmentDate, String slot) {
	
	return false;
}

public  void cancelAppointment(Integer bookingId) {
	
	//return false;
}

public 	BookingDTO findByBookingId(Integer bookingId) {
	
	return null;
}
}
