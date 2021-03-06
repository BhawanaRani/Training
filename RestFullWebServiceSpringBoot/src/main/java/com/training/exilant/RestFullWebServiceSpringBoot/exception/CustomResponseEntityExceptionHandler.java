package com.training.exilant.RestFullWebServiceSpringBoot.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler 
             extends ResponseEntityExceptionHandler{
	
	
	//methods which can handle all types of exceptions
	
	@ExceptionHandler
	public ResponseEntity<Object> handleAllException(Exception ex,
			      WebRequest request)
	{
	ErrorDetails error=new ErrorDetails(new Date(),ex.getMessage(),
			         request.getDescription(true));
	
	
	
	return new ResponseEntity<Object>(error,
			         HttpStatus.INTERNAL_SERVER_ERROR);
	
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> handleUserNotFoundException(Exception ex,
		      WebRequest request)
{
ErrorDetails error=new ErrorDetails(new Date(),ex.getMessage(),
		         "Sorry user not found in db");



return new ResponseEntity<Object>(error,
		         HttpStatus.NOT_FOUND);

}
	
	

}
