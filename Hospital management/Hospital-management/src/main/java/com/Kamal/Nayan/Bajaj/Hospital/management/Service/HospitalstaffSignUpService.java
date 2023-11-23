package com.Kamal.Nayan.Bajaj.Hospital.management.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kamal.Nayan.Bajaj.Hospital.management.DTO.HospitalstaffSignUpRequest;
import com.Kamal.Nayan.Bajaj.Hospital.management.Entity.HospitalstaffSignUp;
import com.Kamal.Nayan.Bajaj.Hospital.management.Exception.NotNullException;
import com.Kamal.Nayan.Bajaj.Hospital.management.Repository.HospitalstaffSignUpRepository;

@Service
public class HospitalstaffSignUpService {

	@Autowired
	private HospitalstaffSignUpRepository hRepo;

	public HospitalstaffSignUp doRegistration(HospitalstaffSignUpRequest hospitalStaffRequset) throws NotNullException {
		
		HospitalstaffSignUp hSignUp = HospitalstaffSignUp.build(hospitalStaffRequset.getId(), hospitalStaffRequset.getName(), hospitalStaffRequset.getAge(), hospitalStaffRequset.getContact(), hospitalStaffRequset.getEmail(), hospitalStaffRequset.getAddress(), hospitalStaffRequset.getDesignation(), hospitalStaffRequset.getPassword());
		
		if(hSignUp != null) {
			return hRepo.save(hSignUp);
		}
		else {
			throw new NotNullException("Empty Data Should not register..: ( ");
		}

	}

	
}
