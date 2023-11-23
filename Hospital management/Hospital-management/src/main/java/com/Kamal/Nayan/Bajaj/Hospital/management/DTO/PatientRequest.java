package com.Kamal.Nayan.Bajaj.Hospital.management.DTO;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Validated
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class PatientRequest {
	private long id;
	@NotNull(message = "please Enter  name ")
	private String name;
	
	@NotNull(message = "please Enter age ")
	private int age;
	
	@NotNull(message = "please Enter roomNo ")
	private int room;
	
	@NotNull(message = "please Enter  Doctor Name")
	private String doctorName;

	@NotNull(message = "please Enter  Admit date ")
	@Pattern(regexp = "^(\\d{4}-\\d{2}-\\d{2})$")
	private String admitDate;
	
	@NotNull(message = "please Enter  total Expense ")
	private long expenses;
	
	@NotNull(message = "please Enter  Staus ")
	private String admitStatus;
	
}
