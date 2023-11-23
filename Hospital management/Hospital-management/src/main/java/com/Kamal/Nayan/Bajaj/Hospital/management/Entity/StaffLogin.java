package com.Kamal.Nayan.Bajaj.Hospital.management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "LonginInfo")
@AllArgsConstructor
@NoArgsConstructor
public class StaffLogin {
	
	@Id
	private long  id;
	
	private String loginGmail;
	
	private String loginPassword;
}
