package com.scg.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler(NotFoundException.class)
	@ResponseBody
	public ResponseEntity<ErrorResponse> handleApiException(final NotFoundException exception) {
		final var errorResponse = new ErrorResponse();
		errorResponse.setErrorCode(exception.getErrorCode().getHttpStatusCode());
		errorResponse.setMessage(exception.getErrorCode().getMessage());
		errorResponse.setException(exception.getException().toString());
		errorResponse.setStatus(HttpStatus.NOT_FOUND);

		return new ResponseEntity<>(errorResponse, errorResponse.getStatus());
	}
}
