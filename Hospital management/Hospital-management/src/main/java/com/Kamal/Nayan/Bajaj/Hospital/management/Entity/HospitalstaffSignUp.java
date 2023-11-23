package com.Kamal.Nayan.Bajaj.Hospital.management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "HospitalStaff")
@AllArgsConstructor (staticName = "build")
@NoArgsConstructor
public class HospitalstaffSignUp {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String name ;
	
	private int age;
	
	private String contact;
	
	private  String email;
	
	private String address;
	
	private String designation;
	
	private String password;

}
