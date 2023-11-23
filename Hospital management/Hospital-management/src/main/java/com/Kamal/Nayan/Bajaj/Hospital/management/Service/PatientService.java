package com.Kamal.Nayan.Bajaj.Hospital.management.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kamal.Nayan.Bajaj.Hospital.management.DTO.PatientRequest;
import com.Kamal.Nayan.Bajaj.Hospital.management.Entity.Patient;
import com.Kamal.Nayan.Bajaj.Hospital.management.Repository.PatientRepository;


@Service
public class PatientService {
	@Autowired
	private PatientRepository pRepo;

	public Patient admit(PatientRequest pRequest) {
		Patient patient = Patient.build(pRequest.getId(), pRequest.getName(), pRequest.getAge(), pRequest.getRoom(), pRequest.getDoctorName(), pRequest.getAdmitDate(), pRequest.getExpenses(), pRequest.getAdmitStatus());
		
		return pRepo.save(patient);
	}

	public Patient getInfo(Long id) {
		Patient p = pRepo.findById(id).get();
		
		if(p!= null) 
		{
			return p;
		}
		return null;
	}
	
	public List<Patient> getAllPatinetinfo(){
		return pRepo.findAll();
	}

	public String deletePatient(Long id) {
		Patient p = pRepo.findById(id).get();
		if(p != null) {
			pRepo.delete(p);
			return "patinet Discharge Successfully";
			}
		return "Patient Deetails Not Found";
	}
	
	
}
