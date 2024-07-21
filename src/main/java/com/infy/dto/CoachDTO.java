package com.infy.dto;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CoachDTO {

	private String coachId;
	
	@NotNull
	@Min(value=5)
	@Max(value=10)
	private  String  password;
	
	@NotNull
	@Min(value=5)
	@Max(value=10)
	private  String  name;
	
	private LocalDate dateOfBirth;
	
	private char gender;
	
	@NotNull
	@Min(value=10)
	@Max(value=10)
	private long mobileNumber;
	
	@NotNull
	@Min(value=3)
	@Max(value=50)
	private  String  speciality;
	
	

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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	
		
	
	
}
