package com.infy.controller;

import java.time.LocalDate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingRestController {
	
	
	@PostMapping(value="/users/{userId}/booking/{coachId}")
	public ResponseEntity<Boolean> bookAppointment(@PathVariable("userId") String userId,@PathVariable("coachId") String coachId,
			@PathVariable("slot") String slot,@RequestBody LocalDate dateOfAppointment ){
		 
		return null;
		
	}
//	@PutMapping(value="/booking/{bookingId}",consumes="{application/xml},{application/json}")
//	public ResponseEntity<Boolean> rescheduleAppointment(@PathVariable("userId") String userId,@PathVariable("coachId") String coachId,
//			@PathVariable("slot") String slot,@RequestBody LocalDate dateOfAppointment ){
//		
//		return null;
//		
//	}
	
	@DeleteMapping("/booking/{bookingId}")
	public ResponseEntity<Boolean> cancelAppointment(@PathVariable("bookingId") Integer bookingId){
		
		
		return null;
	}
	
	
	
	
}
