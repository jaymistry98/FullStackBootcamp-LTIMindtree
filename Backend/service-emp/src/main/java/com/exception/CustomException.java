package com.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class CustomException {
	
	@ExceptionHandler(ServletRequestBindingException.class)
	public ResponseEntity<Object> handleException(Exception ex, WebRequest request){
		
		List<String> details = new ArrayList<String>();
		details.add(ex.getLocalizedMessage());
		return new ResponseEntity(new ErrorResponse("OOPS.....Header Missing", details), HttpStatus.BAD_REQUEST);
	}
}
