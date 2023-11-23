package com.Kamal.Nayan.Bajaj.Hospital.management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Kamal.Nayan.Bajaj.Hospital.management.DTO.HospitalstaffSignUpRequest;
import com.Kamal.Nayan.Bajaj.Hospital.management.Entity.HospitalstaffSignUp;
import com.Kamal.Nayan.Bajaj.Hospital.management.Exception.NotNullException;
import com.Kamal.Nayan.Bajaj.Hospital.management.Service.HospitalstaffSignUpService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/HospitalStaff")
public class HospitalstaffSignUpController {
	@Autowired
	private HospitalstaffSignUpService hService;
	
	@PostMapping("/Registration")
	private ResponseEntity<HospitalstaffSignUp> registerStaff(@RequestBody @Valid HospitalstaffSignUpRequest hospitalStaffRequset) throws NotNullException{
		return new ResponseEntity<HospitalstaffSignUp>(hService.doRegistration(hospitalStaffRequset),HttpStatus.CREATED);
	}
}
