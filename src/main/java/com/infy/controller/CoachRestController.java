package com.infy.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.BookingDTO;
import com.infy.dto.CoachDTO;
import com.infy.dto.LoginDTO;

@RestController
public class CoachRestController {
	
	
	
	
	@PostMapping("/coaches")
	public ResponseEntity<String>createCoach(@RequestBody CoachDTO coachDTO,Errors error){
		return null;
		
		
		
		//return a;
	//	return ResponseEntity(status.);
		
	}
	
	@PostMapping( value="/coaches/login")
	public ResponseEntity<Boolean>loginCoach(@RequestBody LoginDTO loginDTO)
	{
		return null;
	}
	
	@GetMapping(value="/coaches/{coachId}")
	public ResponseEntity<CoachDTO> getCoachProfile(@PathVariable("coachId") String coachId )
	{
		
		return null;
	}
	
	
	@GetMapping(value="/coaches/all")
	public List<CoachDTO> showAllCoaches()
	{
		
		return null;
		
	}
	
	@GetMapping(value="/coaches/booking/{coachId}")
	public List<BookingDTO> showMySchedule(@PathVariable("coachId") String coachId)
	{
		
		return null;
		
	}
	
	
	

}
