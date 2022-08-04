package com.blog.exceptions;

import java.sql.Timestamp;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.blog.payloads.ResponseApi;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	private ResponseEntity<ResponseApi> resourceNotFound(ResourceNotFoundException foundException) {
		return new ResponseEntity<ResponseApi>(new ResponseApi(foundException.getMessage(),
				HttpStatus.NOT_FOUND.value(), new Timestamp(System.currentTimeMillis())), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	private ResponseEntity<Map<String, String>> methodArgumentNotValidException(
			MethodArgumentNotValidException exception) {

		return new ResponseEntity<Map<String, String>>(
				exception.getBindingResult().getAllErrors().stream()
						.collect(Collectors.toMap(e -> ((FieldError) e).getField(), e -> e.getDefaultMessage())),
				HttpStatus.BAD_REQUEST);
	}

}
