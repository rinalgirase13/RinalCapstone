package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.infy.dto.LoginDTO;
import com.infy.dto.UserDTO;
import com.infy.entity.UserEntity;
import com.infy.repository.UserRepository;

@Service
public class UserService {
	
//	@Autowired
//	UserRepository userRepo;


public Object createUser(UserDTO userDTO)
{
      UserEntity userObj= new UserEntity();
      
     // userObj.setUserId(userDTO.getUserId());
      userObj.setName(userDTO.getName());
      userObj.setPassword(userDTO.getPassword());
      userObj.setCity(userDTO.getCity());
      userObj.setCountry(userDTO.getState());
      userObj.setEmail(userDTO.getEmail());
    //  userObj.setGender(userDTO.getGender());
      userObj.setMobilenumber(userDTO.getMobileNumber());
      userObj.setDateofbirth(userDTO.getDateOfBirth());
      userObj.setPincode(userDTO.getPincode());
      userObj.setCountry(userDTO.getCountry());
      
  //    userRepo.save(userObj);
	
	
   return "User Created Successfully with id:"+userObj.getUserId()+"";

}

public Boolean loginUser(LoginDTO loginDTO)
{
	
	return null;
}

public String getUserProfile(String userId) {
	
	return null;
}
}
