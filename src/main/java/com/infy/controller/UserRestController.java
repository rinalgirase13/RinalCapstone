package com.infy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.BookingDTO;
import com.infy.dto.LoginDTO;
import com.infy.dto.UserDTO;
import com.infy.service.BookService;
import com.infy.service.CoachService;
import com.infy.service.UserService;


@Validated
@RestController
public class UserRestController {
	
	
	@Autowired
	private UserService  userservice;
	
	@Autowired 
	private CoachService coachservice;
	
	@Autowired
	private BookService  bookservice;
	
	@GetMapping(value="/getdata")
	public String getstringdata()
	{
		
		return "rinal Girase";
	}
	
	
	
	
	@PostMapping(value="/signupusers")
	public ResponseEntity<Object> createUser(@RequestBody UserDTO userDTO)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(userservice.createUser(userDTO));
		
	}
	
	@PostMapping(value="/users/login")
     public ResponseEntity<Boolean>loginUser(@RequestBody LoginDTO loginDTO)
     {
		
		
		return null;
		
     } 
     
     @GetMapping(value="/users/booking/{userId}")
     public ResponseEntity<UserDTO>getUserProfile(@PathVariable("userId") String userId){
		  return null;
    	 
    	 
     }
     
     @GetMapping(value="/showMyAppointments")
     public List<BookingDTO>showMyAppointments(@PathVariable("userId") String userId)
     {
    	 
    	 return null;
    	 
     }
     
     

}
