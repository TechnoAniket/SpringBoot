package com.Kamal.Nayan.Bajaj.Hospital.management.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import com.Kamal.Nayan.Bajaj.Hospital.management.DTO.StaffLoginRequest;
import com.Kamal.Nayan.Bajaj.Hospital.management.Entity.HospitalstaffSignUp;
import com.Kamal.Nayan.Bajaj.Hospital.management.Entity.StaffLogin;
import com.Kamal.Nayan.Bajaj.Hospital.management.Repository.HospitalstaffSignUpRepository;
import com.Kamal.Nayan.Bajaj.Hospital.management.Repository.StaffLonginRepository;

import jakarta.validation.Valid;

@Service
public class StaffLoginService {

	
@Autowired
private StaffLonginRepository loginRepo;

@Autowired
private HospitalstaffSignUpRepository hRepo;

	public String staggLogedIn(StaffLoginRequest loginRequest) {
		HospitalstaffSignUp hospitalSignup = hRepo.findById(loginRequest.getId()).get();
		
		if(hospitalSignup != null) {
			if(hospitalSignup.getId()==loginRequest.getId()&&
			   hospitalSignup.getEmail().equals(loginRequest.getLoginGmail())&&
			   hospitalSignup.getPassword().equals(loginRequest.getLoginPassword())) 
			{
                loginRepo.save(new StaffLogin(loginRequest.getId(), loginRequest.getLoginGmail(),loginRequest.getLoginPassword()));
				
				return "Login SuccessFull";
			}
			
		}
		return "invalid Authoentication";
	}

}
