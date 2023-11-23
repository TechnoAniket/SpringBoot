package com.Kamal.Nayan.Bajaj.Hospital.management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Kamal.Nayan.Bajaj.Hospital.management.DTO.StaffLoginRequest;
import com.Kamal.Nayan.Bajaj.Hospital.management.Service.StaffLoginService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/Staff")
public class StaffLoginController {

	@Autowired
	private StaffLoginService loginService;
	@PostMapping("/Login")
	private String logIn(@RequestBody @Valid  StaffLoginRequest loginRequest){
		return loginService.staggLogedIn(loginRequest);
	}
}
