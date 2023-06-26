package com.app.exception_handler;
import com.app.dto.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.custom_exceptions.ResourceNotFoundException;

import io.swagger.v3.oas.models.responses.ApiResponse;



//how to tell sc, following class is spring bean containing commonADVICE to all est controllers,regarding centralixed exc handlig
@RestControllerAdvice
//mandatory
// Controller advice+@responseBody
public class GlobalExceptionHandler {
//can contain single/multiple exc handling method
	@org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleMethodArgumentNotValidExceptio(MethodArgumentNotValidException e){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getFieldErrors());                                          
	}
	//Map<String,String> map=new HashMap<K, V>()
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handlerResourceNotFoundException(ResourceNotFoundException e){
		System.out.println("handle res not found"+e);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new com.app.dto.ApiResponse(e.getMessage()));
	}
}
