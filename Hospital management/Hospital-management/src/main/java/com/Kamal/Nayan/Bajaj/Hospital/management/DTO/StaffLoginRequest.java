package com.Kamal.Nayan.Bajaj.Hospital.management.DTO;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Validated
@Data@AllArgsConstructor
@NoArgsConstructor
public class StaffLoginRequest {
	
	@NotNull(message = "For Login Purpose this field should not be empty")
	private long  id;
	
	@NotNull(message = "For Login Purpose this field should not be empty")
	private String loginGmail;
	
	@NotNull(message = "For Login Purpose this field should not be empty")
	private String loginPassword;
	
}
