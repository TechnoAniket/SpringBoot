package com.Kamal.Nayan.Bajaj.Hospital.management.Advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.Kamal.Nayan.Bajaj.Hospital.management.Exception.NotNullException;

@RestControllerAdvice
public class ApplicationExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	
	public Map<String, String> InvalidInput(MethodArgumentNotValidException ex){
		Map<String, String> errorMap = new HashMap<>();
		
		ex.getBindingResult().getFieldErrors().forEach(error ->  {
			errorMap.put(error.getField(), error.getDefaultMessage());
		});
		return errorMap;
	}
	
	
	@ExceptionHandler(NotNullException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public Map<String, String>  nullEntry(NotNullException ex){
		Map<String, String> errorMap = new HashMap<>();
		
		errorMap.put("Error Message : ", ex.getMessage());
		
		return errorMap;
	}
}
