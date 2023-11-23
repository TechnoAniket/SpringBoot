package com.Kamal.Nayan.Bajaj.Hospital.management.DTO;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Validated
@Data
@AllArgsConstructor (staticName = "build")
@NoArgsConstructor
public class HospitalstaffSignUpRequest {

private String name ;

	private long id;

	@NotNull(message = "Please Enter your age . it should be between 21 to 70")
	@Max(70)
	@Min(21)
	private int age;
	
	@Pattern(regexp ="^\\d{10}$",message = "Wrong Mobile Number")
	private String contact;
	
	@Email(message = "Enter valid mail address")
	private String email;
	
	@NotNull(message = "Message field can not be empty")
	private String address;
	
	@NotBlank(message = "State your Designation/Speciality")
	private String designation;
	
	@Size(max = 15, min = 8)
	@NotEmpty(message = "Please Enter Password")
	private String password;
	
	
	
}
