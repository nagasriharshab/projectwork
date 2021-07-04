package com.abc.healthcare.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.abc.healthcare.model.ErrorResponse;
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(value = ResourceAlreadyExistException.class)
	public ResponseEntity<ErrorResponse> handleProductAlreadyExistsException(Exception e){
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setError(e.getMessage());
		errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(value = ResourceNotFoundException.class)
	public ResponseEntity<ErrorResponse> ResourceNotFoundException(Exception e){
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setError(e.getMessage());
		errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
	}
}
