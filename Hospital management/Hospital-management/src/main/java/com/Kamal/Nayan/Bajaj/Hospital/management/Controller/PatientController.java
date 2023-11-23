package com.Kamal.Nayan.Bajaj.Hospital.management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Kamal.Nayan.Bajaj.Hospital.management.DTO.PatientRequest;
import com.Kamal.Nayan.Bajaj.Hospital.management.Entity.Patient;
import com.Kamal.Nayan.Bajaj.Hospital.management.Service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	private PatientService pService;
	
	
	@PostMapping("/RestrationInfo")
	private ResponseEntity<Patient> admitPatient(@RequestBody PatientRequest pRequest){
		return new ResponseEntity<Patient>(pService.admit(pRequest),HttpStatus.CREATED);
	}
	
	@GetMapping("/getPatint/{id}")
	private ResponseEntity<Patient> findPatient(@PathVariable Long id){
		return ResponseEntity.ok(pService.getInfo(id));
	}
	@GetMapping("/getAll")
	private ResponseEntity<List<Patient>> all(){
		return ResponseEntity.ok(pService.getAllPatinetinfo());
	}
	@DeleteMapping("Discharge/{id}")
	private String  dischargePatinet(@PathVariable Long id) {
		return pService.deletePatient(id);
	}
}
