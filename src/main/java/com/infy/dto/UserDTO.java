package com.infy.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class UserDTO {

	
   private String coachId;
   
  
	
	@NotNull
	@Min(value=5)
	@Max(value=10)
	private  String  password;
	
	@NotNull
	@Min(value=5)
	@Max(value=10)
	private  String name;
	
	private LocalDate dateOfBirth;
	
	private String  gender;
	
	@NotNull
	@Min(value=10)
	@Max(value=10)
	private long mobileNumber;
	
	@Email
	private String email;
	
	@NotNull
	@Min(value=3)
	@Max(value=50)
	private  String  speciality;

	@NotNull
	@Min(value=6)
	@Max(value=6)
	private int pincode;
	
	
	@NotNull
	@Min(value=3)
	@Max(value=20)
	private String city;
	
	
	@NotNull
	@Min(value=3)
	@Max(value=20)
	private String state;
	
	@NotNull
	@Min(value=3)
	@Max(value=20)
	private  String country;
	
	
	
	
	
	

	public String getCoachId() {
		return coachId;
	}

	public void setCoachId(String coachId) {
		this.coachId = coachId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
